package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class nr implements Consumer {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ cs b;
    public final /* synthetic */ Object c;

    public nr(cs csVar, String str) {
        this.b = csVar;
        this.c = str;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        cs csVar = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    csVar.h.a(new nlb1((String) obj2));
                }
                break;
            default:
                lw lwVar = (lw) ((spq0) obj).h();
                if (lwVar != null && !lwVar.equals((lw) obj2)) {
                    csVar.q(lwVar);
                    break;
                }
                break;
        }
    }

    public nr(lw lwVar, cs csVar) {
        this.c = lwVar;
        this.b = csVar;
    }
}
