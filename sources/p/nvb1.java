package p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nvb1 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvb1(qvb1 qvb1Var, ovb1 ovb1Var) {
        super(pfz0.a);
        this.b = (byte) 1;
        this.c = qvb1Var;
        this.d = ovb1Var;
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        String str;
        ArrayList arrayList;
        byte b = this.b;
        int i = 2;
        Object obj3 = this.d;
        fav favVar = this.c;
        switch (b) {
            case 0:
                String str2 = (String) obj2;
                if (u890.j((String) obj, str2)) {
                    return;
                }
                agz0 agz0Var = ((qvb1) favVar).b;
                if (agz0Var == null) {
                    u890.C("handle");
                    throw null;
                }
                nvb1 nvb1Var = ((ovb1) obj3).c;
                mma0 mma0Var2 = ovb1.h[1];
                int iOrdinal = ((pfz0) ((sgp0) nvb1Var).a).ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                agz0Var.y(new vfz0(i, str2));
                return;
            case 1:
                pfz0 pfz0Var = (pfz0) obj2;
                if (((pfz0) obj) != pfz0Var) {
                    agz0 agz0Var2 = ((qvb1) favVar).b;
                    if (agz0Var2 == null) {
                        u890.C("handle");
                        throw null;
                    }
                    nvb1 nvb1Var2 = ((ovb1) obj3).b;
                    mma0 mma0Var3 = ovb1.h[0];
                    String str3 = (String) ((sgp0) nvb1Var2).a;
                    int iOrdinal2 = pfz0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i = 1;
                    } else if (iOrdinal2 != 1) {
                        eg.o();
                        return;
                    }
                    agz0Var2.y(new vfz0(i, str3));
                    return;
                }
                return;
            default:
                fav favVar2 = favVar;
                hce1 hce1Var = favVar2.a;
                l320 l320Var = (l320) obj2;
                l320 l320Var2 = (l320) obj;
                if (!u890.j(l320Var2 != null ? l320Var2.b : null, l320Var != null ? l320Var.b : null)) {
                    ((TextView) hce1Var.c).setText(l320Var != null ? l320Var.b : null);
                }
                if (!u890.j(l320Var2 != null ? l320Var2.c : null, l320Var != null ? l320Var.c : null)) {
                    ((TextInputLayout) hce1Var.d).setError(l320Var != null ? l320Var.c : null);
                    TextInputLayout textInputLayout = (TextInputLayout) hce1Var.d;
                    String str4 = l320Var != null ? l320Var.c : null;
                    textInputLayout.setErrorEnabled(!(str4 == null || ihc1.y0(str4)));
                }
                if (!u890.j(l320Var2 != null ? l320Var2.d : null, l320Var != null ? l320Var.d : null)) {
                    ((AutoCompleteTextView) hce1Var.e).setHint(l320Var != null ? l320Var.d : null);
                }
                if (!u890.j(l320Var2 != null ? l320Var2.e : null, l320Var != null ? l320Var.e : null)) {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) hce1Var.e;
                    Context context = (Context) obj3;
                    if (l320Var != null) {
                        ArrayList arrayList2 = l320Var.e;
                        arrayList = new ArrayList(q7h.U(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((k320) it.next()).b);
                        }
                    } else {
                        arrayList = z6x.a;
                    }
                    autoCompleteTextView.setAdapter(new col(context, arrayList));
                }
                String strA = fav.a(favVar2);
                if (strA == null || ihc1.y0(strA)) {
                    strA = null;
                }
                l320 state = favVar2.getState();
                if (state == null || (str = state.f) == null || ihc1.y0(str)) {
                    str = null;
                }
                if (!u890.j(strA, str)) {
                    favVar2.b(l320Var != null ? l320Var.f : null);
                }
                favVar2.g.a(l320Var != null);
                favVar2.h.a((l320Var != null ? l320Var.c : null) != null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvb1(ViewGroup viewGroup, Object obj, byte b) {
        super((Object) null);
        this.b = b;
        this.c = viewGroup;
        this.d = obj;
    }
}
