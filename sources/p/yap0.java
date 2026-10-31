package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vuk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yap0(vuk vukVar, byte b) {
        super(0);
        this.a = b;
        this.b = vukVar;
    }

    public final Object invoke() {
        byte b = this.a;
        vuk vukVar = this.b;
        switch (b) {
            case 0:
                return vukVar.h();
            case 1:
                return vukVar.j();
            case 2:
                return vukVar.j();
            case 3:
                return vukVar.j();
            case 4:
                return new fbp0(vukVar, (byte) 0);
            case 5:
                return vukVar.j();
            case 6:
                return vukVar.j();
            case 7:
                return vukVar.f();
            case 8:
                return vukVar.j();
            case 9:
                return vukVar.j();
            case 10:
                return vukVar.c();
            case 11:
                return new fbp0(vukVar, (byte) 1);
            default:
                return vukVar.b();
        }
    }
}
