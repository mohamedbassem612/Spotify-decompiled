package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a4v implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ a4v(ArrayList arrayList, ven0 ven0Var, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                qt80 qt80Var = (qt80) obj;
                if (qt80Var instanceof y3v) {
                    arrayList.add(qt80Var);
                } else if (qt80Var instanceof z3v) {
                    arrayList.remove(((z3v) qt80Var).a);
                }
                ven0Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                sy20 sy20Var = (qt80) obj;
                if (sy20Var instanceof ry20) {
                    arrayList.add(sy20Var);
                } else if (sy20Var instanceof sy20) {
                    arrayList.remove(sy20Var.a);
                }
                ven0Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                qt80 qt80Var2 = (qt80) obj;
                if (qt80Var2 instanceof r9w0) {
                    arrayList.add(qt80Var2);
                } else if (qt80Var2 instanceof s9w0) {
                    arrayList.remove(((s9w0) qt80Var2).a);
                } else if (qt80Var2 instanceof q9w0) {
                    arrayList.remove(((q9w0) qt80Var2).a);
                }
                ven0Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return rih1Var;
    }
}
