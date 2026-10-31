package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dm1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dm1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (((sl1) obj2).a()) {
                    rt01.e((rt01) obj).b();
                }
                break;
            default:
                ena enaVar = (ena) obj2;
                String str = (String) obj;
                ((vna) enaVar.f.get()).a(str);
                enaVar.a.e(str);
                break;
        }
    }
}
