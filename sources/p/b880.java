package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b880 implements x780 {
    public final hyy0 a;
    public final p8h b;
    public final Context c;
    public final ae5 d;
    public final il00 e;
    public final a42 f;
    public final q8n g;
    public final agc0 h;
    public final boolean i;

    public b880(hyy0 hyy0Var, p8h p8hVar, Context context, ae5 ae5Var, il00 il00Var, a42 a42Var, q8n q8nVar, agc0 agc0Var, boolean z) {
        this.a = hyy0Var;
        this.b = p8hVar;
        this.c = context;
        this.d = ae5Var;
        this.e = il00Var;
        this.f = a42Var;
        this.g = q8nVar;
        this.h = agc0Var;
        this.i = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, String str4, t45 t45Var, onm onmVar) {
        y780 y780Var;
        if (onmVar instanceof y780) {
            y780Var = (y780) onmVar;
            int i = y780Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y780Var.f = i - Integer.MIN_VALUE;
            } else {
                y780Var = new y780(this, onmVar);
            }
        } else {
            y780Var = new y780(this, onmVar);
        }
        Object objA = y780Var.d;
        int i2 = y780Var.f;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                t45Var.getClass();
                t45Var.l("color_extraction_inactive", null, (2 & 4) != 0);
                p8h p8hVar = this.b;
                y780Var.a = str;
                y780Var.b = str2;
                y780Var.c = t45Var;
                y780Var.f = 1;
                objA = p8hVar.a(str2, str3, str4, y780Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t45Var = y780Var.c;
                str2 = y780Var.b;
                str = y780Var.a;
                hm5.M(objA);
            }
            String str5 = (String) objA;
            t45Var.g("color_extraction_inactive");
            return str5;
        } catch (Throwable th) {
            try {
                this.d.a(str, str2, th);
                return "";
            } finally {
                t45Var.g("color_extraction_inactive");
            }
        }
    }

    public final nmo b(u011 u011Var, String str) {
        String string;
        String strB = u011Var.b();
        String title = u011Var.getTitle();
        if (u011Var.h().length() > 0) {
            string = u011Var.h();
        } else {
            String string2 = u011Var.j().toString();
            this.h.getClass();
            boolean zM = sto1.m(string2);
            Context context = this.c;
            if (zM || dm61.z0(v6b1.X1, v6b1.a2, v6b1.Z1, v6b1.Y1).contains(new y6b1(string2, false).c)) {
                string = context.getString(2131959300);
                string.getClass();
            } else {
                if (dm61.z0(v6b1.N0, v6b1.O0).contains(new y6b1(u011Var.j().toString(), false).c)) {
                    string = context.getString(2131959299);
                    string.getClass();
                } else {
                    string = "";
                }
            }
        }
        return new nmo(u011Var.j(), strB, this.f.h(u011Var.b()), title, string, str);
    }

    public final WidgetState.InactiveSession c(String str, nmo nmoVar, List list, boolean z) {
        eey eeyVarJ = this.e.j(z);
        List<u011> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (u011 u011Var : list2) {
            arrayList.add(u011.a(u011Var, hno1.q(Uri.parse(u011Var.b()), u011Var.j()).toString(), this.f.h(u011Var.b()), 19));
        }
        return new WidgetState.InactiveSession(nmoVar, arrayList, str, eeyVarJ.b(), eeyVarJ.a(), z, this.i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(t45 t45Var, onm onmVar) {
        a880 a880Var;
        if (onmVar instanceof a880) {
            a880Var = (a880) onmVar;
            int i = a880Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a880Var.d = i - Integer.MIN_VALUE;
            } else {
                a880Var = new a880(this, onmVar);
            }
        } else {
            a880Var = new a880(this, onmVar);
        }
        Object objJ = a880Var.b;
        int i2 = a880Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            t45Var.getClass();
            t45Var.l("recommendations_loading_inactive", null, (2 & 4) != 0);
            a880Var.a = t45Var;
            a880Var.d = 1;
            objJ = this.a.j(a880Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t45Var = a880Var.a;
            hm5.M(objJ);
        }
        l111 l111Var = (l111) objJ;
        t45Var.a("recommendations_cached", z5c.b(l111Var.a()));
        t45Var.g("recommendations_loading_inactive");
        return l111Var.b();
    }
}
