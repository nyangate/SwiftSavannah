package ke.co.makeswift.swiftsavannah;

import android.graphics.Movie;
import android.os.Handler;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

/**
 * Created by robertnyangate on 27/07/2017.
 */

public class GIFWallpaperEngine extends WallpaperService.Engine {
    private final int frameDuration = 20;

    private SurfaceHolder holder;
    private Movie movie;
    private boolean visible;
    private Handler handler;

    public GIFWallpaperEngine(Movie movie) {
        this.movie = movie;
        handler = new Handler();
    }

    @Override
    public void onCreate(SurfaceHolder surfaceHolder) {
        super.onCreate(surfaceHolder);
        this.holder = surfaceHolder;
    }
}