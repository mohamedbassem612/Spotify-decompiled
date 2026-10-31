package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cdo0 {
    public cdo0 a = null;
    public cdo0 b = null;
    public cdo0 c = null;
    public cdo0 d = null;
    public cdo0 e = null;
    public ArrayList f = null;

    public final void a(sla1 sla1Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(sla1Var);
    }

    public void b(cdo0 cdo0Var) {
        cdo0Var.g();
        cdo0Var.d(this);
        cdo0 cdo0Var2 = this.c;
        if (cdo0Var2 == null) {
            this.b = cdo0Var;
            this.c = cdo0Var;
        } else {
            cdo0Var2.e = cdo0Var;
            cdo0Var.d = cdo0Var2;
            this.c = cdo0Var;
        }
    }

    public final List c() {
        ArrayList arrayList = this.f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public void d(cdo0 cdo0Var) {
        this.a = cdo0Var;
    }

    public final void e(List list) {
        if (list.isEmpty()) {
            this.f = null;
        } else {
            this.f = new ArrayList(list);
        }
    }

    public String f() {
        return "";
    }

    public final void g() {
        cdo0 cdo0Var = this.d;
        if (cdo0Var != null) {
            cdo0Var.e = this.e;
        } else {
            cdo0 cdo0Var2 = this.a;
            if (cdo0Var2 != null) {
                cdo0Var2.b = this.e;
            }
        }
        cdo0 cdo0Var3 = this.e;
        if (cdo0Var3 != null) {
            cdo0Var3.d = cdo0Var;
        } else {
            cdo0 cdo0Var4 = this.a;
            if (cdo0Var4 != null) {
                cdo0Var4.c = cdo0Var;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return gvg.h(getClass().getSimpleName(), "{", f(), "}");
    }
}
