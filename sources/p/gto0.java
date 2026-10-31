package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService;
import io.reactivex.rxjava3.core.Single;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gto0 implements jrn0, xi7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kto0 b;

    public /* synthetic */ gto0(kto0 kto0Var, byte b) {
        this.a = b;
        this.b = kto0Var;
    }

    public Single l(Intent intent, th61 th61Var) {
        j3i1 j3i1Var;
        kto0 kto0Var = this.b;
        kto0Var.e();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("push_data", vjq0.class) : intent.getParcelableExtra("push_data");
        if (parcelableExtra == null) {
            eg.m("Push action data should not be null");
            return null;
        }
        vjq0 vjq0Var = (vjq0) parcelableExtra;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.addFlags(268435456);
        kto0Var.f(vjq0Var.a);
        Uri uri = Uri.parse(vjq0Var.d);
        int i = 0;
        int i2 = 1;
        if (!uri.isHierarchical() || uri.getQueryParameter("sp_req_login_token") == null) {
            j3i1Var = new j3i1(uri, ((u890.j(uri.getScheme(), "http") || u890.j(uri.getScheme(), "https")) && (u890.j(uri.getHost(), "spotify.com") || u890.j(uri.getHost(), "www.spotify.com"))) ? !ihc1.h0(uri.toString(), "notoken", false) : false);
        } else {
            String query = uri.getQuery();
            if (query == null) {
                query = "";
            }
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            Charset charset = nne.a;
            int i3 = 6;
            List listQ0 = ihc1.Q0(query, new String[]{"&"}, 0, 6);
            ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
            Iterator it = listQ0.iterator();
            while (it.hasNext()) {
                List listQ1 = ihc1.Q0((String) it.next(), new String[]{"="}, i, i3);
                String str = (String) (listQ1.size() > 0 ? listQ1.get(i) : "");
                int length = str.length() - i2;
                int i4 = i;
                int i5 = i4;
                while (i4 <= length) {
                    int i6 = u890.q(str.charAt(i5 == 0 ? i4 : length), 32) <= 0 ? i2 : 0;
                    if (i5 != 0) {
                        if (i6 == 0) {
                            break;
                        }
                        length--;
                    } else if (i6 == 0) {
                        i5 = i2;
                    } else {
                        i4++;
                    }
                }
                String strK = i1o1.k(str.subSequence(i4, length + 1).toString(), charset);
                String str2 = (String) (i2 < listQ1.size() ? listQ1.get(i2) : "");
                int length2 = str2.length() - i2;
                int i7 = 0;
                boolean z = false;
                while (i7 <= length2) {
                    boolean z2 = u890.q(str2.charAt(!z ? i7 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length2--;
                    } else if (z2) {
                        i7++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(new mmr0(strK, i1o1.k(str2.subSequence(i7, length2 + 1).toString(), charset)));
                i = 0;
                i2 = 1;
                i3 = 6;
            }
            ArrayList<mmr0> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!u890.j(((mmr0) obj).a, "sp_req_login_token")) {
                    arrayList2.add(obj);
                }
            }
            for (mmr0 mmr0Var : arrayList2) {
                builderClearQuery.appendQueryParameter((String) mmr0Var.a, (String) mmr0Var.b);
            }
            j3i1Var = new j3i1(builderClearQuery.build(), true);
        }
        boolean z3 = j3i1Var.a;
        Uri uri2 = j3i1Var.b;
        if (z3) {
            Single map = kto0Var.g.b(uri2).map(new f71(intent2, (byte) 2));
            map.getClass();
            return map;
        }
        intent2.setData(uri2);
        Single singleJust = Single.just(new drn0(intent2));
        singleJust.getClass();
        return singleJust;
    }

    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public irn0 m648l(Intent intent, th61 th61Var) {
        Parcelable parcelableExtra;
        Parcelable parcelableExtra2;
        Parcelable parcelableExtra3;
        byte b = this.a;
        kto0 kto0Var = this.b;
        switch (b) {
            case 0:
                kto0Var.e();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (Parcelable) intent.getParcelableExtra("push_data", rjq0.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("push_data");
                }
                if (parcelableExtra != null) {
                    kto0Var.f(((rjq0) parcelableExtra).a);
                    Set set = s4b1.f;
                    return new ern0(uic.x(nik1.F2.a));
                }
                eg.m("Push action data should not be null");
                return null;
            case 1:
                kto0Var.e();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = (Parcelable) intent.getParcelableExtra("push_data", z261.class);
                } else {
                    parcelableExtra2 = intent.getParcelableExtra("push_data");
                }
                if (parcelableExtra2 != null) {
                    kto0Var.f(((z261) parcelableExtra2).a);
                    uf0 uf0Var = kto0Var.d;
                    int i = EmailVerifyDispatcherService.e;
                    Context context = uf0Var.a;
                    context.startService(new Intent(context, (Class<?>) EmailVerifyDispatcherService.class));
                    Set set2 = s4b1.f;
                    return new ern0(uic.x(nik1.z0.a));
                }
                eg.m("Push action data should not be null");
                return null;
            default:
                kto0Var.e();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra3 = (Parcelable) intent.getParcelableExtra("push_data", vjq0.class);
                } else {
                    parcelableExtra3 = intent.getParcelableExtra("push_data");
                }
                if (parcelableExtra3 != null) {
                    vjq0 vjq0Var = (vjq0) parcelableExtra3;
                    kto0Var.f(vjq0Var.a);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setComponent(intent.getComponent());
                    Set set3 = s4b1.f;
                    String strD = uic.x(vjq0Var.d).D();
                    intent2.setData(strD != null ? Uri.parse(strD) : null);
                    intent2.putExtra("is_internal_navigation", true);
                    tv80 tv80VarL = gg.l(intent);
                    if (tv80VarL != null) {
                        gg.I(intent2, tv80VarL);
                    }
                    return new drn0(intent2);
                }
                eg.m("Push action data should not be null");
                return null;
        }
    }
}
