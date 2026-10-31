package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w5r0 implements fkk1 {
    public final /* synthetic */ byte a;
    public final kdn0 b;

    public w5r0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new kdn0();
                break;
            default:
                this.b = new kdn0(new Rect(0, 0, 0, 0));
                break;
        }
    }

    public final ymd0 a() {
        byte b = this.a;
        return this.b;
    }
}
