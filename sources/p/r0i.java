package p;

import android.content.res.Resources;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r0i extends kkn {
    public final /* synthetic */ byte e;
    public final List f;
    public final Object g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0i(byte b, Object obj, Object obj2, List list) {
        super(false);
        this.e = b;
        this.g = obj;
        this.f = list;
        this.h = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$NoComparatorFound */
    public boolean E(tka0 tka0Var, iu30 iu30Var) throws ComponentRecyclerAdapter.NoComparatorFound {
        a1i a1iVar = (a1i) ((LinkedHashMap) this.h).get(tka0Var);
        if (a1iVar != null) {
            return ((Boolean) iu30Var.invoke(a1iVar)).booleanValue();
        }
        throw new ComponentRecyclerAdapter.NoComparatorFound("No ComponentModelComparator instance for " + tka0Var + " supplied.");
    }

    @Override // p.kkn
    public final boolean i(int i, int i2) {
        byte b = this.e;
        Object obj = this.g;
        List list = this.f;
        switch (b) {
            case 0:
                Object obj2 = ((ArrayList) obj).get(i);
                Object obj3 = list.get(i2);
                if ((obj2 == null || obj3 != null) && (obj2 != null || obj3 == null)) {
                    if (obj2 == null && obj3 == null) {
                        return true;
                    }
                    obj2.getClass();
                    obj3.getClass();
                    if (obj2.getClass() == obj3.getClass()) {
                        return E(rc11.a.b(obj2.getClass()), new q0i(obj2, obj3, (byte) 0));
                    }
                }
                return false;
            default:
                m2g1 m2g1Var = (m2g1) ((List) this.h).get(i2);
                m2g1 m2g1Var2 = (m2g1) list.get(i);
                Resources resources = (Resources) obj;
                return m2g1Var.c.invoke(resources).equals(m2g1Var2.c.invoke(resources)) && m2g1Var.d.invoke(resources).equals(m2g1Var2.d.invoke(resources)) && u890.j(m2g1Var.e, m2g1Var2.e) && m2g1Var.f == m2g1Var2.f && m2g1Var.g == m2g1Var2.g && m2g1Var.h == m2g1Var2.h && m2g1Var.i.equals(m2g1Var2.i) && m2g1Var.j == m2g1Var2.j && m2g1Var.k == m2g1Var2.k;
        }
    }

    @Override // p.kkn
    public final boolean j(int i, int i2) {
        byte b = this.e;
        List list = this.f;
        switch (b) {
            case 0:
                Object obj = ((ArrayList) this.g).get(i);
                Object obj2 = list.get(i2);
                if (obj != null && obj2 == null) {
                    return false;
                }
                if (obj == null && obj2 != null) {
                    return false;
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                obj.getClass();
                obj2.getClass();
                if (obj.getClass() != obj2.getClass()) {
                    return false;
                }
                return E(rc11.a.b(obj.getClass()), new q0i(obj, obj2, (byte) 1));
            default:
                return ((m2g1) ((List) this.h).get(i2)).a.equals(((m2g1) list.get(i)).a);
        }
    }

    @Override // p.kkn
    public final Object o(int i, int i2) {
        switch (this.e) {
            case 0:
                return this.f.get(i2);
            default:
                return rih1.a;
        }
    }

    @Override // p.kkn
    public final int q() {
        switch (this.e) {
            case 0:
                return this.f.size();
            default:
                return ((List) this.h).size();
        }
    }

    @Override // p.kkn
    public final int r() {
        switch (this.e) {
            case 0:
                return ((ArrayList) this.g).size();
            default:
                return this.f.size();
        }
    }
}
