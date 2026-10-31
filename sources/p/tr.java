package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class tr implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lw b;

    public /* synthetic */ tr(byte b, cs csVar, lw lwVar) {
        this.a = b;
        this.b = lwVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        lw lwVar = this.b;
        switch (b) {
            case 0:
                return spq0.d(lwVar.a);
            case 1:
                return lwVar.c != null ? new i5w0(lwVar) : j5.a;
            case 2:
                lw lwVar2 = (lw) ((spq0) obj).h();
                if (lwVar2 != null) {
                    lwVar = lwVar2;
                }
                return new m941(cs.r(lwVar));
            default:
                lw lwVar3 = (lw) ((spq0) obj).h();
                if (lwVar3 != null) {
                    lwVar = lwVar3;
                }
                return new m941(cs.r(lwVar));
        }
    }

    public /* synthetic */ tr(lw lwVar, byte b) {
        this.a = b;
        this.b = lwVar;
    }
}
