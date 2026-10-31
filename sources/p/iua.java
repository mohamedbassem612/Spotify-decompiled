package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iua {
    public int a;
    public int b;
    public String c;

    public static v a() {
        v vVar = new v();
        vVar.b = 0;
        vVar.c = "";
        return vVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = vsn1.a;
        mmn1 mmn1Var = fpn1.c;
        Integer numValueOf = Integer.valueOf(i);
        return gvg.h("Response Code: ", (!mmn1Var.containsKey(numValueOf) ? fpn1.RESPONSE_CODE_UNSPECIFIED : (fpn1) mmn1Var.get(numValueOf)).toString(), ", Debug Message: ", this.c);
    }
}
