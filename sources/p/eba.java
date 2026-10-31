package p;

import android.graphics.Rect;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eba implements dba {
    public float a;
    public final Object b;
    public Object c;
    public Object d;

    public eba(List list) {
        this.d = null;
        this.a = -1.0f;
        this.b = list;
        this.c = a(0.0f);
    }

    public sua0 a(float f) {
        List list = (List) this.b;
        sua0 sua0Var = (sua0) list.get(list.size() - 1);
        if (f >= sua0Var.b()) {
            return sua0Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            sua0 sua0Var2 = (sua0) list.get(size);
            if (((sua0) this.c) != sua0Var2 && f >= sua0Var2.b() && f < sua0Var2.a()) {
                return sua0Var2;
            }
        }
        return (sua0) list.get(0);
    }

    public boolean b(float f) {
        sua0 sua0Var = (sua0) this.d;
        sua0 sua0Var2 = (sua0) this.c;
        if (sua0Var == sua0Var2 && this.a == f) {
            return true;
        }
        this.d = sua0Var2;
        this.a = f;
        return false;
    }

    public sua0 c() {
        return (sua0) this.c;
    }

    public boolean d(float f) {
        sua0 sua0Var = (sua0) this.c;
        if (f >= sua0Var.b() && f < sua0Var.a()) {
            return !((sua0) this.c).c();
        }
        this.c = a(f);
        return true;
    }

    public float e() {
        return ((sua0) ((List) this.b).get(0)).b();
    }

    public float f() {
        List list = (List) this.b;
        return ((sua0) list.get(list.size() - 1)).a();
    }

    public void g(float f) {
        this.a = f;
        if (f < 0.0f) {
            this.a = 0.0f;
            f = 0.0f;
        }
        if (f > 1.0f) {
            this.a = 1.0f;
        }
        ((Rect) this.c).offsetTo(0, Math.round((((Rect) this.b).height() - ((RecyclerViewFastScroller) this.d).c) * this.a));
    }

    public boolean isEmpty() {
        return false;
    }

    public eba(RecyclerViewFastScroller recyclerViewFastScroller) {
        this.d = recyclerViewFastScroller;
        this.b = new Rect();
        this.c = new Rect();
    }
}
