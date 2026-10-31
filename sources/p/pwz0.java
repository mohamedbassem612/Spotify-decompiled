package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pwz0 {
    public final en31 a;

    public pwz0(en31 en31Var) {
        this.a = en31Var;
    }

    public final void a(y341 y341Var, y36 y36Var) {
        t36 t36Var = (t36) y36Var.keySet();
        y36 y36Var2 = t36Var.a;
        if (y36Var2.isEmpty()) {
            return;
        }
        if (((jv81) y36Var).c > 999) {
            q3p1.s(y36Var, new owz0(this, y341Var, (byte) 0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        anm1.h(((jv81) y36Var2).c, sb);
        sb.append(")");
        d441 d441VarG1 = y341Var.g1(sb.toString());
        Iterator it = t36Var.iterator();
        int i = 1;
        while (true) {
            t980 t980Var = (t980) it;
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
        int iM = d9y0.m(d441VarG1, "work_spec_id");
        if (iM == -1) {
            d441VarG1.close();
            return;
        }
        while (d441VarG1.f1()) {
            List list = (List) y36Var.get(d441VarG1.P0(iM));
            if (list != null) {
                byte[] blob = d441VarG1.getBlob(0);
                ewq ewqVar = ewq.b;
                list.add(o0c.A(blob));
            }
        }
        d441VarG1.close();
    }

    public final void b(y341 y341Var, y36 y36Var) {
        t36 t36Var = (t36) y36Var.keySet();
        y36 y36Var2 = t36Var.a;
        if (y36Var2.isEmpty()) {
            return;
        }
        if (((jv81) y36Var).c > 999) {
            q3p1.s(y36Var, new owz0(this, y341Var, (byte) 1));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        anm1.h(((jv81) y36Var2).c, sb);
        sb.append(")");
        d441 d441VarG1 = y341Var.g1(sb.toString());
        Iterator it = t36Var.iterator();
        int i = 1;
        while (true) {
            t980 t980Var = (t980) it;
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
        int iM = d9y0.m(d441VarG1, "work_spec_id");
        if (iM == -1) {
            d441VarG1.close();
            return;
        }
        while (d441VarG1.f1()) {
            List list = (List) y36Var.get(d441VarG1.P0(iM));
            if (list != null) {
                list.add(d441VarG1.P0(0));
            }
        }
        d441VarG1.close();
    }
}
