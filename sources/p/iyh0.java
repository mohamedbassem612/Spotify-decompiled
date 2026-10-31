package p;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iyh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kyh0 b;

    public /* synthetic */ iyh0(kyh0 kyh0Var, byte b) {
        this.a = b;
        this.b = kyh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p7s p7sVar = this.b.l;
                if (p7sVar != null) {
                    p7sVar.f((eyh0) null);
                }
                this.b.l = null;
                return;
            case 1:
                kyh0 kyh0Var = this.b;
                eyh0 eyh0Var = kyh0Var.i;
                if (eyh0Var == null) {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
                if (eyh0Var.o()) {
                    eyh0 eyh0Var2 = kyh0Var.i;
                    if (eyh0Var2 == null) {
                        u890.C("mediaSessionCompat");
                        throw null;
                    }
                    eyh0Var2.y(false);
                    hyh0 hyh0Var = kyh0Var.j;
                    if (hyh0Var == null) {
                        u890.C("callback");
                        throw null;
                    }
                    hyh0Var.k.c();
                    eyh0 eyh0Var3 = kyh0Var.i;
                    if (eyh0Var3 != null) {
                        eyh0Var3.z(null, null);
                        return;
                    } else {
                        u890.C("mediaSessionCompat");
                        throw null;
                    }
                }
                return;
            default:
                eyh0 eyh0Var4 = this.b.i;
                if (eyh0Var4 == null) {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
                yxh0 yxh0Var = (yxh0) eyh0Var4.b;
                yxh0Var.getClass();
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setLegacyStreamType(3);
                yxh0Var.a.setPlaybackToLocal(builder.build());
                return;
        }
    }
}
