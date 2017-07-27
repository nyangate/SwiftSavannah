package ke.co.makeswift.swiftsavannah;

import android.graphics.Movie;
import android.service.wallpaper.WallpaperService;

import com.orhanobut.logger.Logger;

import java.io.IOException;

/**
 * Created by robertnyangate on 27/07/2017.
 */

public class SavannahService extends WallpaperService {
    @Override
    public WallpaperService.Engine onCreateEngine() {
        try {
            Movie movie = Movie.decodeStream(
                    getResources().getAssets().open("girl.gif"));

            return new GIFWallpaperEngine(movie);
        }catch(Exception e){
            Logger.d("Could not load asset");
            return null;
        }
    }
}
