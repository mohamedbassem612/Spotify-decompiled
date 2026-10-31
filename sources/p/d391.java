package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class d391 {
    public static final Size a = new Size(0, 0);
    public static final Size b;
    public static final Size c;
    public static final Size d;
    public static final Size e;
    public static final Size f;

    static {
        new Size(320, 240);
        b = new Size(640, 480);
        c = new Size(720, 480);
        d = new Size(1280, 720);
        e = new Size(1920, 1080);
        f = new Size(1920, 1440);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
