package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qc01 implements vr20 {
    public final /* synthetic */ lee1 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ hdn0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ bw91 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ed01 f;
    public final /* synthetic */ yae1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ven0 t;

    public qc01(hdn0 hdn0Var, ven0 ven0Var, bw91 bw91Var, c9n c9nVar, ven0 ven0Var2, ed01 ed01Var, yae1 yae1Var, int i, int i2, ven0 ven0Var3, lee1 lee1Var, int i3, ven0 ven0Var4) {
        this.a = hdn0Var;
        this.b = ven0Var;
        this.c = bw91Var;
        this.d = c9nVar;
        this.e = ven0Var2;
        this.f = ed01Var;
        this.g = yae1Var;
        this.h = i;
        this.i = i2;
        this.t = ven0Var3;
        this.X = lee1Var;
        this.Y = i3;
        this.Z = ven0Var4;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        mmr0 mmr0Var = (mmr0) obj;
        int iIntValue = ((Number) mmr0Var.a).intValue();
        List list = (List) mmr0Var.b;
        id01 id01Var = zc01.a;
        this.a.t(iIntValue);
        List list2 = list;
        if (!list2.isEmpty() && iIntValue < list.size()) {
            Iterator it = list.subList(0, iIntValue).iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((String) it.next()).length();
            }
            ((vu30) this.b.getValue()).invoke(new Integer(length), new Integer(((String) list.get(iIntValue)).length() + length));
        }
        if (!list2.isEmpty() && iIntValue >= list.size() - 3) {
            bw91 bw91Var = this.c;
            sb01 sb01Var = (sb01) o7h.C0(bw91Var);
            String str = sb01Var != null ? sb01Var.f.a : null;
            if (str != null && str.length() != 0) {
                ven0 ven0Var = this.e;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    fn31.T(this.d, (o8n) null, 0, new aco(this.f, str, bw91Var, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, ven0Var, (lnm) null), 3);
                }
            }
        }
        return rih1.a;
    }
}
