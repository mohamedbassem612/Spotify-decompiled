package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tq71 {
    public final Context a;
    public final r961 b;
    public final cab c;

    public tq71(Context context, r961 r961Var, cab cabVar) {
        this.a = context;
        this.b = r961Var;
        this.c = cabVar;
    }

    public static void e(Object obj, il71 il71Var, String str) {
        if (!(obj instanceof m231)) {
            il71Var.setAttribute(str.concat(".result"), "success");
        }
        if (e331.a(obj) != null) {
            il71Var.setAttribute(str.concat(".result"), "failure");
        }
    }

    public final zd71 a(jq71 jq71Var, jq71 jq71Var2, llw0 llw0Var, String str) {
        Context context;
        List list = jq71Var.g;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            context = this.a;
            if (!zHasNext) {
                break;
            }
            arrayList.add(new jlw0((Uri) it.next(), context.getString(2131956653)));
        }
        Integer num = jq71Var.b;
        int iIntValue = num != null ? num.intValue() : Color.parseColor("#FF535353");
        Integer num2 = jq71Var.c;
        return new zd71(context, str, jq71Var, jq71Var2, o7h.N0(p7h.M(new llw0[]{llw0Var, new ilw0(iIntValue, num2 != null ? num2.intValue() : Color.parseColor("#000000"), context.getString(2131956351))}), arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, z771 z771Var, exy exyVar, il71 il71Var, onm onmVar) {
        mq71 mq71Var;
        String str2;
        if (onmVar instanceof mq71) {
            mq71Var = (mq71) onmVar;
            int i = mq71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq71Var.d = i - Integer.MIN_VALUE;
            } else {
                mq71Var = new mq71(this, onmVar);
            }
        } else {
            mq71Var = new mq71(this, onmVar);
        }
        mq71 mq71Var2 = mq71Var;
        Object objA = mq71Var2.b;
        int i2 = mq71Var2.d;
        if (i2 == 0) {
            hm5.M(objA);
            nq71 nq71Var = new nq71(this, il71Var, str, z771Var, exyVar, null, (byte) 0);
            mq71Var2.a = str;
            mq71Var2.d = 1;
            objA = il71Var.a("fetching_playlist_sticker", nq71Var, mq71Var2);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = mq71Var2.a;
            hm5.M(objA);
            str2 = str3;
        }
        jq71 jq71Var = (jq71) objA;
        Uri uri = jq71Var.a;
        String strA = jq71Var.a();
        if (strA == null) {
            strA = "";
        }
        return new zd71(this.a, str2, null, null, Collections.singletonList(new jlw0(uri, strA)), 8);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(String str, z771 z771Var, exy exyVar, il71 il71Var, onm onmVar) {
        oq71 oq71Var;
        String str2;
        if (onmVar instanceof oq71) {
            oq71Var = (oq71) onmVar;
            int i = oq71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oq71Var.d = i - Integer.MIN_VALUE;
            } else {
                oq71Var = new oq71(this, onmVar);
            }
        } else {
            oq71Var = new oq71(this, onmVar);
        }
        oq71 oq71Var2 = oq71Var;
        Object objA = oq71Var2.b;
        int i2 = oq71Var2.d;
        if (i2 == 0) {
            hm5.M(objA);
            o1f1 o1f1Var = exyVar.b;
            boolean z = o1f1Var instanceof n1f1;
            d9n d9nVar = d9n.a;
            if (z && (o1f1Var instanceof n1f1) && ((n1f1) o1f1Var).a) {
                rq71 rq71Var = new rq71((byte) 0, str, null, z771Var, il71Var, this);
                oq71Var2.a = null;
                oq71Var2.d = 1;
                Object objS = smo1.s(rq71Var, oq71Var2);
                if (objS != d9nVar) {
                    return objS;
                }
            } else {
                nq71 nq71Var = new nq71(this, il71Var, str, z771Var, exyVar, null, (byte) 1);
                oq71Var2.a = str;
                oq71Var2.d = 2;
                objA = il71Var.a("fetching_playlist_sticker", nq71Var, oq71Var2);
                if (objA != d9nVar) {
                    str2 = str;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objA);
            return objA;
        }
        if (i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str3 = oq71Var2.a;
        hm5.M(objA);
        str2 = str3;
        return new zd71(this.a, str2, (jq71) objA, null, null, 16);
    }

    public final Object d(String str, z771 z771Var, exy exyVar, String str2, il71 il71Var, onm onmVar) {
        String str3 = exyVar.a;
        String str4 = str3 == null ? str : str3;
        o1f1 o1f1Var = exyVar.b;
        if ((o1f1Var instanceof n1f1) && (o1f1Var instanceof n1f1) && ((n1f1) o1f1Var).a && (str2 == null || str2.length() == 0)) {
            return smo1.s(new rq71((byte) 1, str4, null, z771Var, il71Var, this), onmVar);
        }
        return smo1.s(new qt61((Object) il71Var, (Object) this, (Object) str4, (Object) str2, (Object) z771Var, (Object) exyVar, (lnm) null, (byte) 3), onmVar);
    }
}
