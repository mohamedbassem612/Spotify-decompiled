package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uh30 implements dkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uh30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.dkl
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((zh30) obj2).i.m();
                break;
            default:
                ((do0) obj2).a((iua) obj, new f1z0(new ArrayList(), new ArrayList()));
                break;
        }
    }
}
