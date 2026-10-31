package p;

import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class kth1 extends tv30 implements vu30 {
    public static final kth1 a = new kth1(2, mth1.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/martini/elements/updatenotification/api/UpdateNotificationElement$Props;Lcom/spotify/martini/elements/updatenotification/api/UpdateNotificationElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        hth1 hth1Var = (hth1) obj;
        jth1 jth1Var = (jth1) obj2;
        String str = hth1Var.h;
        String str2 = hth1Var.g;
        String str3 = jth1Var.k;
        String str4 = jth1Var.j;
        String str5 = hth1Var.e;
        boolean z = u890.j(str5, jth1Var.e) && u890.j(hth1Var.f, jth1Var.f) && u890.j(hth1Var.d, jth1Var.d) && hth1Var.c.equals(jth1Var.c);
        if (str5 != null) {
            if (z) {
                return (str2.equals(str4) && str.equals(str3)) ? Next.j() : Next.h(jth1.a(jth1Var, null, null, false, false, str2, str, 511));
            }
            return Next.i(mth1.u(hth1Var), mth1.B(hth1Var));
        }
        if (z && hth1Var.b.equals(jth1Var.b) && u890.j(hth1Var.a, jth1Var.a)) {
            return (str2.equals(str4) && str.equals(str3)) ? Next.j() : Next.h(jth1.a(jth1Var, null, null, false, false, str2, str, 511));
        }
        return Next.i(mth1.u(hth1Var), mth1.B(hth1Var));
    }
}
