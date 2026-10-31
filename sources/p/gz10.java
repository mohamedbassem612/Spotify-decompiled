package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gz10 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gz10(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean a(String str) {
        if (this.a) {
            return true;
        }
        if (str.equals("canvas-video")) {
            return this.b;
        }
        if (nhc1.Y(str, "watch-feed", false)) {
            return this.d;
        }
        if (nhc1.Y(str, "audio-browse", false)) {
            return this.c;
        }
        return false;
    }
}
