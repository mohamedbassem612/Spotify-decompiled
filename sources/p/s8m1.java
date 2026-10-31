package p;

import com.spotify.wrapped.v1.proto.ConsumerShareRequestParameters;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s8m1 implements eec {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s8m1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.eec
    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                q8m1 q8m1Var = (q8m1) obj2;
                q8m1Var.e.invoke();
                ((cik1) obj).n(2, q8m1Var.a, q8m1Var.b, (ConsumerShareRequestParameters) null, q8m1Var.d, (tv80) null);
                break;
            default:
                o0i o0iVar = (o0i) ((obm1) obj2).a.c.getValue();
                if (o0iVar != null) {
                    o0iVar.d.A();
                }
                ((eec) obj).a();
                break;
        }
    }
}
