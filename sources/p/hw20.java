package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hw20 implements lnm {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hw20(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final o8n getContext() {
        switch (this.a) {
            case 0:
                return (o8n) this.b;
            default:
                return o6x.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    public final void resumeWith(Object obj) {
        Object obj2;
        long j;
        byte b = this.a;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                jw20 jw20Var = (jw20) obj3;
                sty styVar = new sty(1, jw20Var, jw20.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25);
                try {
                    o6x o6xVar = ((q6) jw20Var).d;
                    hr80.w(rih1.a, aym.t(o6xVar == o6x.a ? new v890(jw20Var, styVar) : new w890(jw20Var, o6xVar, styVar)));
                    return;
                } catch (Throwable th) {
                    ozn1.n(th, jw20Var);
                    throw null;
                }
            default:
                if (obj != null) {
                    i1k0.B("fetchInstallReferrer resumeWith got result: " + obj);
                    qn80 qn80Var = (qn80) obj;
                    Context context = (Context) this.b;
                    String str = qn80Var.c;
                    long j2 = qn80Var.d;
                    long j3 = qn80Var.b;
                    String str2 = qn80Var.a;
                    boolean z = qn80Var.g;
                    Long l = qn80Var.e;
                    Long l2 = qn80Var.f;
                    String str3 = "google_search_install_referrer";
                    obj2 = obj3;
                    ne neVarZ = ne.z(context);
                    SharedPreferences.Editor editor = (SharedPreferences.Editor) neVarZ.b;
                    if (TextUtils.isEmpty(str2)) {
                        str3 = "google_search_install_referrer";
                    } else {
                        if (!TextUtils.isEmpty(str2)) {
                            neVarZ.Z("bnc_app_store_source", str2);
                        }
                        f4t f4tVar = f4t.b;
                        if (str2.equals("Meta")) {
                            editor.putBoolean("bnc_is_meta_clickthrough", z).apply();
                        }
                    }
                    long j4 = 0;
                    if (j2 > 0) {
                        neVarZ.W(j2, "bnc_referrer_click_ts");
                    }
                    if (j3 > 0) {
                        neVarZ.W(j3, "bnc_install_begin_ts");
                    }
                    if (str != null) {
                        try {
                            String strDecode = URLDecoder.decode(str, "UTF-8");
                            HashMap map = new HashMap();
                            String[] strArrSplit = strDecode.split("&");
                            neVarZ.Z("bnc_google_play_install_referrer_extras", strDecode);
                            int length = strArrSplit.length;
                            int i = 0;
                            while (i < length) {
                                String str4 = strArrSplit[i];
                                if (TextUtils.isEmpty(str4)) {
                                    j = j4;
                                } else {
                                    String[] strArrSplit2 = str4.split((str4.contains("=") || !str4.contains("-")) ? "=" : "-");
                                    j = j4;
                                    if (strArrSplit2.length > 1) {
                                        try {
                                            map.put(URLDecoder.decode(strArrSplit2[0], "UTF-8"), URLDecoder.decode(strArrSplit2[1], "UTF-8"));
                                        } catch (UnsupportedEncodingException e) {
                                            e = e;
                                            i1k0.C("Caught UnsupportedEncodingException " + e.getMessage());
                                            if (l != null) {
                                                neVarZ.W(l.longValue(), "bnc_install_begin_server_ts");
                                            }
                                            if (l2 != null) {
                                                neVarZ.W(l2.longValue(), "bnc_referrer_click_server_ts");
                                            }
                                            ic9 ic9Var = (ic9) obj2;
                                            ((u861) ic9Var.b).g.remove(t861.d);
                                            i1k0.B("INSTALL_REFERRER_FETCH_WAIT_LOCK removed");
                                            ((n3c) ic9Var.c).f.p("onInstallReferrersFinished");
                                            return;
                                        } catch (IllegalArgumentException e2) {
                                            e = e2;
                                            i1k0.C("Caught IllegalArgumentException " + e.getMessage());
                                            if (l != null) {
                                                neVarZ.W(l.longValue(), "bnc_install_begin_server_ts");
                                            }
                                            if (l2 != null) {
                                                neVarZ.W(l2.longValue(), "bnc_referrer_click_server_ts");
                                            }
                                            ic9 ic9Var2 = (ic9) obj2;
                                            ((u861) ic9Var2.b).g.remove(t861.d);
                                            i1k0.B("INSTALL_REFERRER_FETCH_WAIT_LOCK removed");
                                            ((n3c) ic9Var2.c).f.p("onInstallReferrersFinished");
                                            return;
                                        }
                                    }
                                }
                                i++;
                                j4 = j;
                            }
                            j = j4;
                            f4t f4tVar2 = f4t.b;
                            if (map.containsKey("link_click_id")) {
                                String str5 = (String) map.get("link_click_id");
                                q1o1.c = str5;
                                neVarZ.V(str5);
                            }
                            if (map.containsKey("is_full_app_conversion") && map.containsKey("referring_link")) {
                                editor.putBoolean("bnc_is_full_app_conversion", Boolean.parseBoolean((String) map.get("is_full_app_conversion"))).apply();
                                neVarZ.Z("bnc_app_link", (String) map.get("referring_link"));
                            }
                            String str6 = str3;
                            if (map.containsKey(str6)) {
                                neVarZ.Z("bnc_google_search_install_identifier", (String) map.get(str6));
                            }
                            if (map.containsValue("play-auto-installs")) {
                                crm0.B(context, map);
                            }
                        } catch (UnsupportedEncodingException e3) {
                            e = e3;
                            j = j4;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            j = j4;
                        }
                    } else {
                        j = 0;
                    }
                    if (l != null && l.longValue() > j) {
                        neVarZ.W(l.longValue(), "bnc_install_begin_server_ts");
                    }
                    if (l2 != null && l2.longValue() > j) {
                        neVarZ.W(l2.longValue(), "bnc_referrer_click_server_ts");
                    }
                    break;
                } else {
                    obj2 = obj3;
                    i1k0.B("fetchInstallReferrer resumeWith got null result");
                }
                ic9 ic9Var3 = (ic9) obj2;
                ((u861) ic9Var3.b).g.remove(t861.d);
                i1k0.B("INSTALL_REFERRER_FETCH_WAIT_LOCK removed");
                ((n3c) ic9Var3.c).f.p("onInstallReferrersFinished");
                return;
        }
    }
}
