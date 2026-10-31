package p;

import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zur {
    public static final Set e = f46.S0(new String[]{"REJECTION_REASON_INVALID_INPUT", "REJECTION_REASON_OVERSIZED_PROFILE", "REJECTION_REASON_EXPIRED_CAPTURE", "REJECTION_REASON_IDENTITY_MISMATCH", "REJECTION_REASON_UNSUPPORTED_TRACE_FORMAT", "REJECTION_REASON_EXPIRED_UPLOAD", "REJECTION_REASON_OBJECT_SIZE_MISMATCH", "REJECTION_REASON_INVALID_OBJECT_METADATA"});
    public static final Set f = f46.S0(new String[]{"REJECTION_REASON_QUOTA_EXCEEDED", "REJECTION_REASON_TOO_MANY_INCOMPLETE_UPLOADS", "REJECTION_REASON_GLOBAL_KILL_SWITCH", "REJECTION_REASON_CLIENT_KILL_SWITCH"});
    public final poj0 a;
    public final Function0 b;
    public final iu30 c;
    public final ro30 d;

    public zur(poj0 poj0Var, ro30 ro30Var) {
        uur uurVar = uur.a;
        vur vurVar = vur.a;
        this.a = poj0Var;
        this.b = uurVar;
        this.c = vurVar;
        this.d = ro30Var;
    }

    public static y1u b(int i, boolean z) {
        return (i == 401 || d(i) || (z && i == 409) || 400 > i || i >= 500) ? x1u.a : new u1u(f4i1.c(i, "Control request HTTP "));
    }

    public static final String c(String str, Map map) {
        Iterator it = map.entrySet().iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (nhc1.S((String) ((Map.Entry) next).getKey(), str, true)) {
                if (!z) {
                    obj = next;
                    z = true;
                }
            }
            obj = null;
            break;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (String) entry.getValue();
        }
        return null;
    }

    public static boolean d(int i) {
        if (f46.S0(new Integer[]{408, 425, 429}).contains(Integer.valueOf(i))) {
            return true;
        }
        return 500 <= i && i < 600;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v0u v0uVar, String str, onm onmVar) {
        wur wurVar;
        if (onmVar instanceof wur) {
            wurVar = (wur) onmVar;
            int i = wurVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wurVar.e = i - Integer.MIN_VALUE;
            } else {
                wurVar = new wur(this, onmVar);
            }
        } else {
            wurVar = new wur(this, onmVar);
        }
        Object objC = wurVar.c;
        int i2 = wurVar.e;
        if (i2 == 0) {
            hm5.M(objC);
            n1u n1uVar = v0uVar.c;
            wurVar.a = v0uVar;
            wurVar.b = str;
            wurVar.e = 1;
            poj0 poj0Var = this.a;
            String str2 = (String) ((iu30) poj0Var.c).invoke(n1uVar);
            k370 k370Var = new k370();
            k370Var.f((l370) null, str2);
            k370 k370VarG = k370Var.b().g();
            k370VarG.h(0, str.length(), str, false, false);
            k370VarG.h(0, 8, "complete", false, false);
            objC = poj0Var.C(k370VarG.b().i, ((nfa0) poj0Var.b).b(kyh.Companion.serializer(), new kyh(str)), wurVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wurVar.b;
            v0uVar = wurVar.a;
            hm5.M(objC);
        }
        e1u e1uVar = (e1u) objC;
        int i3 = e1uVar.a;
        ro30 ro30Var = this.d;
        ro30Var.t("Upload completion request returned HTTP " + i3);
        String str3 = v0uVar.b;
        new Integer(i3);
        s1u s1uVar = (s1u) e1uVar.b;
        if (i3 != 200) {
            return b(i3, true);
        }
        x1u x1uVar = x1u.a;
        if (s1uVar == null) {
            ro30Var.t("Upload completion response had no body");
            return x1uVar;
        }
        if (!u890.j(s1uVar.a, str)) {
            ro30Var.t("Upload completion response did not match the reservation");
            return x1uVar;
        }
        String str4 = s1uVar.b;
        if (u890.j(str4, "UPLOAD_STATE_COMPLETE")) {
            return t1u.a;
        }
        if (u890.j(str4, "UPLOAD_STATE_REJECTED")) {
            return e(s1uVar.c, true);
        }
        ro30Var.t("Upload completion response had an unrecognized state");
        return x1uVar;
    }

    public final y1u e(String str, boolean z) {
        String str2;
        boolean z2 = o7h.i0(e, str) || (z && o7h.i0(f, str));
        if (!z2) {
            str2 = "Upload response had an unrecognized rejection reason; report will be retried";
        } else {
            if (str == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            str2 = "Diagnostic report upload was rejected: " + ((Object) str);
        }
        this.d.t(str2);
        if (!z2) {
            return x1u.a;
        }
        if (str != null) {
            return new w1u(str);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v0u v0uVar, onm onmVar) {
        xur xurVar;
        if (onmVar instanceof xur) {
            xurVar = (xur) onmVar;
            int i = xurVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xurVar.d = i - Integer.MIN_VALUE;
            } else {
                xurVar = new xur(this, onmVar);
            }
        } else {
            xurVar = new xur(this, onmVar);
        }
        Object objG = xurVar.b;
        int i2 = xurVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                xurVar.a = v0uVar;
                xurVar.d = 1;
                objG = g(v0uVar, xurVar);
                Object obj = d9n.a;
                if (objG == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v0uVar = xurVar.a;
                hm5.M(objG);
            }
            return (y1u) objG;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            this.d.t("Diagnostic report upload failed during transport or response processing due to ".concat(e3.getClass().getSimpleName()));
            Logger.d("Diagnostic report %s upload failed (%s)", new Object[]{v0uVar.b, e3.getClass().getSimpleName()});
            return x1u.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0221  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x022b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:135:0x0272  */
    /* JADX WARN: Code duplicated, block: B:138:0x0280 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0281  */
    /* JADX WARN: Code duplicated, block: B:141:0x0287  */
    /* JADX WARN: Code duplicated, block: B:159:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x022b, please report this as an issue */
    public final Object g(v0u v0uVar, onm onmVar) {
        yur yurVar;
        String str;
        l370 l370VarB;
        String str2;
        Long lD0;
        Map map;
        String strC;
        Long lD1;
        r8i0 r8i0VarW;
        v0u v0uVar2;
        s1u s1uVar;
        h1u h1uVar;
        int i;
        String str3;
        Object objA;
        v0u v0uVar3 = v0uVar;
        if (onmVar instanceof yur) {
            yurVar = (yur) onmVar;
            int i2 = yurVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yurVar.e = i2 - Integer.MIN_VALUE;
            } else {
                yurVar = new yur(this, onmVar);
            }
        } else {
            yurVar = new yur(this, onmVar);
        }
        Object objC = yurVar.c;
        int i3 = yurVar.e;
        poj0 poj0Var = this.a;
        x1u x1uVar = x1u.a;
        ro30 ro30Var = this.d;
        Object obj = d9n.a;
        if (i3 == 0) {
            hm5.M(objC);
            File file = v0uVar3.a;
            long j = v0uVar3.f;
            if (!file.isFile() || v0uVar3.a.length() != j) {
                ro30Var.t("Diagnostic report payload is missing or changed");
                return new v1u();
            }
            yurVar.a = v0uVar3;
            yurVar.e = 1;
            objC = poj0Var.C((String) ((iu30) poj0Var.c).invoke(v0uVar3.c), ((nfa0) poj0Var.b).b(rrn.Companion.serializer(), new rrn(v0uVar3.b, v0uVar3.d, String.valueOf(v0uVar3.e), String.valueOf(j), v0uVar3.g, v0uVar3.h, v0uVar3.i, v0uVar3.j, v0uVar3.k, v0uVar3.l)), yurVar);
            if (objC != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            v0uVar3 = yurVar.a;
            hm5.M(objC);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    hm5.M(objC);
                    return objC;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s1uVar = yurVar.b;
            v0uVar2 = yurVar.a;
            hm5.M(objC);
        }
        h1uVar = (h1u) objC;
        if (u890.j(h1uVar, f1u.a)) {
            ro30Var.t("Could not send signed upload request: invalid reservation");
            return x1uVar;
        }
        if (h1uVar instanceof g1u) {
            eg.o();
            return null;
        }
        i = ((g1u) h1uVar).a;
        ro30Var.t("Signed upload request returned HTTP " + i);
        String str4 = v0uVar2.b;
        new Integer(i);
        if ((200 <= i || i >= 300) && i != 412) {
            return (i != 401 || i == 403 || d(i)) ? x1uVar : new u1u(f4i1.c(i, "Unexpected signed PUT HTTP "));
        }
        str3 = s1uVar.a;
        if (str3 != null) {
            hhg1.n("Required value was null.");
            return null;
        }
        yurVar.a = null;
        yurVar.b = null;
        yurVar.e = 3;
        objA = a(v0uVar2, str3, yurVar);
        if (objA != obj) {
            return obj;
        }
        return objA;
        e1u e1uVar = (e1u) objC;
        int i4 = e1uVar.a;
        ro30Var.t("Upload reservation request returned HTTP " + i4);
        String str5 = v0uVar3.b;
        new Integer(i4);
        s1u s1uVar2 = (s1u) e1uVar.b;
        if (i4 != 200) {
            return b(i4, false);
        }
        if (s1uVar2 == null) {
            ro30Var.t("Upload reservation response had no body");
            return x1uVar;
        }
        String str6 = s1uVar2.b;
        if (str6 != null) {
            int iHashCode = str6.hashCode();
            if (iHashCode != -1184741909) {
                if (iHashCode != 1004593802) {
                    if (iHashCode == 1013645125 && str6.equals("UPLOAD_STATE_COMPLETE")) {
                        return t1u.a;
                    }
                } else if (str6.equals("UPLOAD_STATE_REJECTED")) {
                    return e(s1uVar2.c, false);
                }
            } else if (str6.equals("UPLOAD_STATE_PENDING")) {
                long j2 = v0uVar3.f;
                String str7 = s1uVar2.a;
                if (str7 != null && k1u.s(str7) && (str = s1uVar2.d) != null) {
                    try {
                        k370 k370Var = new k370();
                        k370Var.f((l370) null, str);
                        l370VarB = k370Var.b();
                    } catch (IllegalArgumentException unused) {
                        l370VarB = null;
                    }
                    if (l370VarB != null && ((Boolean) this.c.invoke(l370VarB)).booleanValue() && (str2 = s1uVar2.e) != null && (lD0 = nhc1.d0(10, str2)) != null && lD0.longValue() > ((Number) this.b.invoke()).longValue() && (strC = c("Content-Length", (map = s1uVar2.f))) != null && (lD1 = nhc1.d0(10, strC)) != null && lD1.longValue() == j2) {
                        String strC2 = c("Content-Type", map);
                        if (strC2 != null) {
                            se11 se11Var = r8i0.e;
                            try {
                                r8i0VarW = bmq0.w(strC2);
                            } catch (IllegalArgumentException unused2) {
                                r8i0VarW = null;
                            }
                        } else {
                            r8i0VarW = null;
                        }
                        if (r8i0VarW != null && u890.j(c("Content-Encoding", map), "identity")) {
                            Set<String> setKeySet = map.keySet();
                            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                                for (String str8 : setKeySet) {
                                    if (nhc1.S(str8, "Authorization", true) || nhc1.S(str8, "Transfer-Encoding", true) || nhc1.S(str8, "Host", true)) {
                                    }
                                }
                            }
                            yurVar.a = v0uVar3;
                            yurVar.b = s1uVar2;
                            yurVar.e = 2;
                            Object objK = poj0Var.K(v0uVar3, s1uVar2, yurVar);
                            if (objK != obj) {
                                v0uVar2 = v0uVar3;
                                s1uVar = s1uVar2;
                                objC = objK;
                                h1uVar = (h1u) objC;
                                if (u890.j(h1uVar, f1u.a)) {
                                    ro30Var.t("Could not send signed upload request: invalid reservation");
                                    return x1uVar;
                                }
                                if (h1uVar instanceof g1u) {
                                    eg.o();
                                    return null;
                                }
                                i = ((g1u) h1uVar).a;
                                ro30Var.t("Signed upload request returned HTTP " + i);
                                String str9 = v0uVar2.b;
                                new Integer(i);
                                if (200 <= i) {
                                    if (i != 401) {
                                        return x1uVar;
                                    }
                                    return x1uVar;
                                }
                                if (i != 401) {
                                    return x1uVar;
                                }
                                return x1uVar;
                                str3 = s1uVar.a;
                                if (str3 != null) {
                                    hhg1.n("Required value was null.");
                                    return null;
                                }
                                yurVar.a = null;
                                yurVar.b = null;
                                yurVar.e = 3;
                                objA = a(v0uVar2, str3, yurVar);
                                if (objA != obj) {
                                    return objA;
                                }
                            }
                            return obj;
                        }
                    }
                }
                ro30Var.t("Upload reservation was invalid or expired");
                return x1uVar;
            }
        }
        ro30Var.t("Upload reservation response had an unrecognized state");
        return x1uVar;
    }
}
