package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class se00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se00(long j, String str) {
        super(1);
        this.c = j;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        switch (this.a) {
            case 0:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM Events WHERE id > ? AND (((authenticated IS NULL OR authenticated = 1) AND (Owner = ? OR Owner IS NULL)) OR (authenticated = 0)) ORDER BY id ASC LIMIT ?");
                try {
                    d441VarG1.r(1, this.c);
                    d441VarG1.K(2, this.b);
                    d441VarG1.r(3, 40L);
                    int iW = y7y0.w(d441VarG1, "id");
                    int iW2 = y7y0.w(d441VarG1, "authenticated");
                    int iW3 = y7y0.w(d441VarG1, "eventName");
                    int iW4 = y7y0.w(d441VarG1, "sequenceId");
                    int iW5 = y7y0.w(d441VarG1, "sequenceNumber");
                    int iW6 = y7y0.w(d441VarG1, "fragments");
                    int iW7 = y7y0.w(d441VarG1, "owner");
                    int iW8 = y7y0.w(d441VarG1, "deviceId");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        ba00 ba00Var = new ba00();
                        ba00Var.a = d441VarG1.getLong(iW);
                        Integer numValueOf = d441VarG1.isNull(iW2) ? null : Integer.valueOf((int) d441VarG1.getLong(iW2));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        ba00Var.b = boolValueOf;
                        if (d441VarG1.isNull(iW3)) {
                            ba00Var.c = null;
                        } else {
                            ba00Var.c = d441VarG1.P0(iW3);
                        }
                        if (d441VarG1.isNull(iW4)) {
                            ba00Var.d = null;
                        } else {
                            ba00Var.d = d441VarG1.getBlob(iW4);
                        }
                        ba00Var.e = d441VarG1.getLong(iW5);
                        if (d441VarG1.isNull(iW6)) {
                            ba00Var.f = null;
                        } else {
                            ba00Var.f = d441VarG1.getBlob(iW6);
                        }
                        if (d441VarG1.isNull(iW7)) {
                            ba00Var.g = null;
                        } else {
                            ba00Var.g = d441VarG1.P0(iW7);
                        }
                        if (d441VarG1.isNull(iW8)) {
                            ba00Var.h = null;
                        } else {
                            ba00Var.h = d441VarG1.P0(iW8);
                        }
                        arrayList.add(ba00Var);
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            default:
                pyg pygVar = (pyg) obj;
                byg bygVar = (byg) pygVar.a;
                return new fmg0(bygVar.c, bygVar.d, mqo1.A(bygVar.e), bygVar.f, this.b, this.c, pygVar.b, pygVar.c, pygVar.e, pygVar.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se00(String str, long j) {
        super(1);
        this.b = str;
        this.c = j;
    }
}
