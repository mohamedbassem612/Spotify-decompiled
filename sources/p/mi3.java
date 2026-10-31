package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mi3 extends ovb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cwb b;

    public /* synthetic */ mi3(cwb cwbVar, byte b) {
        this.a = b;
        this.b = cwbVar;
    }

    public final void a(View view, float f) {
        byte b = this.a;
    }

    public final void b(View view, int i) {
        byte b = this.a;
        cwb cwbVar = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    cwbVar.g().L(5);
                }
                break;
            case 1:
                if (i == 5) {
                    cwbVar.cancel();
                }
                break;
            default:
                if (i == 4) {
                    cwbVar.g().L(5);
                }
                break;
        }
    }

    private final void c(View view, float f) {
    }

    private final void d(View view, float f) {
    }

    private final void e(View view, float f) {
    }
}
