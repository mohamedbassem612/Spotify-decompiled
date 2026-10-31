package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dxl1 {
    public final en31 a;
    public final qs0 b = new qs0((byte) 15);
    public final zsp0 c = new zsp0((byte) 1);

    public dxl1(en31 en31Var) {
        this.a = en31Var;
    }

    public final void a(y341 y341Var, y36 y36Var) throws Exception {
        t36 t36VarKeySet = y36Var.keySet();
        if (t36VarKeySet.isEmpty()) {
            return;
        }
        if (y36Var.c > 999) {
            q3p1.s(y36Var, new bxl1(this, y341Var, (byte) 0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        anm1.h(t36VarKeySet.size(), sb);
        sb.append(")");
        d441 d441VarG1 = y341Var.g1(sb.toString());
        t980 it = t36VarKeySet.iterator();
        int i = 1;
        while (true) {
            t980 t980Var = it;
            if (!t980Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            }
            d441VarG1.K(i, (String) t980Var.next());
            i++;
        }
        int iV = y7y0.v(d441VarG1);
        if (iV == -1) {
            d441VarG1.close();
            return;
        }
        while (d441VarG1.f1()) {
            List list = (List) y36Var.get(d441VarG1.P0(iV));
            if (list != null) {
                byte[] blob = d441VarG1.getBlob(0);
                ewq ewqVar = ewq.b;
                list.add(o0c.A(blob));
            }
        }
        d441VarG1.close();
    }

    public final void b(y341 y341Var, y36 y36Var) throws Exception {
        t36 t36VarKeySet = y36Var.keySet();
        if (t36VarKeySet.isEmpty()) {
            return;
        }
        if (y36Var.c > 999) {
            q3p1.s(y36Var, new bxl1(this, y341Var, (byte) 1));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        anm1.h(t36VarKeySet.size(), sb);
        sb.append(")");
        d441 d441VarG1 = y341Var.g1(sb.toString());
        t980 it = t36VarKeySet.iterator();
        int i = 1;
        while (true) {
            t980 t980Var = it;
            if (!t980Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            }
            d441VarG1.K(i, (String) t980Var.next());
            i++;
        }
        int iV = y7y0.v(d441VarG1);
        if (iV == -1) {
            d441VarG1.close();
            return;
        }
        while (d441VarG1.f1()) {
            List list = (List) y36Var.get(d441VarG1.P0(iV));
            if (list != null) {
                list.add(d441VarG1.P0(0));
            }
        }
        d441VarG1.close();
    }

    public final wvl1 c(String str) {
        return (wvl1) qyo1.x(this.a, true, false, new jfa(str, (byte) 21));
    }

    public final vwl1 d(String str) {
        return (vwl1) qyo1.x(this.a, true, false, new jfa(str, (byte) 19));
    }

    public final List e(String str) {
        return (List) qyo1.x(this.a, true, false, new jfa(str, (byte) 20));
    }

    public final void f(long j, String str) {
        ((Number) qyo1.x(this.a, false, true, new zwl1((byte) 0, j, str))).intValue();
    }

    public final void g(wvl1 wvl1Var, String str) {
        ((Number) qyo1.x(this.a, false, true, new vae1(wvl1Var, str, (byte) 14))).intValue();
    }

    public final void h(int i, String str) {
        qyo1.x(this.a, false, true, new ydd1(i, str));
    }
}
