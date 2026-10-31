package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class va31 {
    public final yi31 a;
    public final cxc b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public va31(yi31 yi31Var, cxc cxcVar) {
        this.a = yi31Var;
        this.b = cxcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(RiveAnimation riveAnimation, onm onmVar) throws Throwable {
        sa31 sa31Var;
        byte[] bArr;
        if (onmVar instanceof sa31) {
            sa31Var = (sa31) onmVar;
            int i = sa31Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa31Var.e = i - Integer.MIN_VALUE;
            } else {
                sa31Var = new sa31(this, onmVar);
            }
        } else {
            sa31Var = new sa31(this, onmVar);
        }
        Object objB = sa31Var.c;
        int i2 = sa31Var.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            String url = riveAnimation.getUrl();
            sa31Var.a = riveAnimation;
            sa31Var.e = 1;
            objB = b(url, sa31Var);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            riveAnimation = sa31Var.a;
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bArr = sa31Var.b;
            hm5.M(objB);
        }
        return new qa31(bArr, (List) objB);
        byte[] bArr2 = (byte[]) objB;
        sa31Var.a = null;
        sa31Var.b = bArr2;
        sa31Var.e = 2;
        Object objC = c(riveAnimation, sa31Var);
        if (objC != obj) {
            objB = objC;
            bArr = bArr2;
            return new qa31(bArr, (List) objB);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v15, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [byte[], java.io.Serializable] */
    public final Serializable b(String str, onm onmVar) throws Throwable {
        ta31 ta31Var;
        va31 va31Var;
        Throwable th;
        int i;
        va31 va31Var2;
        Throwable th2;
        String str2;
        va31 va31Var3;
        va31 va31Var4;
        if (onmVar instanceof ta31) {
            ta31Var = (ta31) onmVar;
            int i2 = ta31Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ta31Var.g = i2 - Integer.MIN_VALUE;
            } else {
                ta31Var = new ta31(this, onmVar);
            }
        } else {
            ta31Var = new ta31(this, onmVar);
        }
        Object obj = ta31Var.e;
        int i3 = ta31Var.g;
        ConcurrentHashMap concurrentHashMap = this.c;
        ConcurrentHashMap concurrentHashMap2 = this.d;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i3 == 0) {
                    hm5.M(obj);
                    ?? r11 = (byte[]) concurrentHashMap.get(str);
                    if (r11 != 0) {
                        return r11;
                    }
                    va31Var = (vgn0) concurrentHashMap2.computeIfAbsent(str, azt.h);
                    ta31Var.a = str;
                    ta31Var.b = va31Var;
                    ta31Var.c = va31Var;
                    i = 0;
                    ta31Var.d = 0;
                    ta31Var.g = 1;
                    if (va31Var.a(ta31Var) != d9nVar) {
                        va31Var2 = va31Var;
                    }
                    return d9nVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    va31Var4 = ta31Var.c;
                    va31Var3 = ta31Var.b;
                    str2 = ta31Var.a;
                    try {
                        hm5.M(obj);
                        ?? r12 = (byte[]) obj;
                        concurrentHashMap.put(str2, r12);
                        concurrentHashMap2.remove(str2, va31Var3);
                        va31Var4.c((Object) null);
                        return r12;
                    } catch (Throwable th3) {
                        th2 = th3;
                        concurrentHashMap2.remove(str2, va31Var3);
                        throw th2;
                    }
                }
                int i4 = ta31Var.d;
                va31 va31Var5 = ta31Var.c;
                va31Var2 = ta31Var.b;
                String str3 = ta31Var.a;
                hm5.M(obj);
                va31Var = va31Var5;
                i = i4;
                str = str3;
                ?? r8 = (byte[]) concurrentHashMap.get(str);
                if (r8 != 0) {
                    try {
                        concurrentHashMap2.remove(str, va31Var2);
                        va31Var.c((Object) null);
                        return r8;
                    } catch (Throwable th4) {
                        th = th4;
                        va31Var.c((Object) null);
                        throw th;
                    }
                }
                yi31 yi31Var = this.a;
                ta31Var.a = str;
                ta31Var.b = va31Var2;
                ta31Var.c = va31Var;
                ta31Var.d = i;
                ta31Var.g = 2;
                cxc cxcVar = yi31Var.a;
                ne neVar = new ne((byte) 9);
                neVar.e0(str);
                neVar.t();
                ry21 ry21VarE = cxcVar.a(new ln21(neVar)).e();
                try {
                    Object objR = qxd0.R(ry21VarE.g, 10485760L);
                    ry21VarE.close();
                    if (objR != d9nVar) {
                        va31Var4 = va31Var;
                        obj = objR;
                        str2 = str;
                        va31Var3 = va31Var2;
                        ?? r13 = (byte[]) obj;
                        concurrentHashMap.put(str2, r13);
                        concurrentHashMap2.remove(str2, va31Var3);
                        va31Var4.c((Object) null);
                        return r13;
                    }
                    return d9nVar;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        u890.p(ry21VarE, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                th2 = th7;
                str2 = str;
                va31Var3 = va31Var2;
                concurrentHashMap2.remove(str2, va31Var3);
                throw th2;
            }
        } catch (Throwable th8) {
            va31Var = this;
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(RiveAnimation riveAnimation, onm onmVar) throws Throwable {
        ua31 ua31Var;
        va31 va31Var;
        Throwable th;
        int i;
        va31 va31Var2;
        Throwable th2;
        RiveAnimation riveAnimation2;
        va31 va31Var3;
        va31 va31Var4;
        if (onmVar instanceof ua31) {
            ua31Var = (ua31) onmVar;
            int i2 = ua31Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ua31Var.g = i2 - Integer.MIN_VALUE;
            } else {
                ua31Var = new ua31(this, onmVar);
            }
        } else {
            ua31Var = new ua31(this, onmVar);
        }
        Object obj = ua31Var.e;
        int i3 = ua31Var.g;
        byte b = 2;
        ConcurrentHashMap concurrentHashMap = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.f;
        Serializable serializable = d9n.a;
        try {
            try {
                if (i3 == 0) {
                    hm5.M(obj);
                    List list = (List) concurrentHashMap.get(riveAnimation);
                    if (list != null) {
                        return list;
                    }
                    va31Var = (vgn0) concurrentHashMap2.computeIfAbsent(riveAnimation, azt.i);
                    ua31Var.a = riveAnimation;
                    ua31Var.b = va31Var;
                    ua31Var.c = va31Var;
                    i = 0;
                    ua31Var.d = 0;
                    ua31Var.g = 1;
                    if (va31Var.a(ua31Var) != serializable) {
                        va31Var2 = va31Var;
                    }
                    return serializable;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    va31Var4 = ua31Var.c;
                    va31Var3 = ua31Var.b;
                    riveAnimation2 = ua31Var.a;
                    try {
                        hm5.M(obj);
                        List list2 = (List) obj;
                        concurrentHashMap.put(riveAnimation2, list2);
                        concurrentHashMap2.remove(riveAnimation2, va31Var3);
                        va31Var4.c((Object) null);
                        return list2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        concurrentHashMap2.remove(riveAnimation2, va31Var3);
                        throw th2;
                    }
                }
                int i4 = ua31Var.d;
                va31 va31Var5 = ua31Var.c;
                va31Var2 = ua31Var.b;
                RiveAnimation riveAnimation3 = ua31Var.a;
                hm5.M(obj);
                va31Var = va31Var5;
                i = i4;
                riveAnimation = riveAnimation3;
                List list3 = (List) concurrentHashMap.get(riveAnimation);
                if (list3 != null) {
                    try {
                        concurrentHashMap2.remove(riveAnimation, va31Var2);
                        va31Var.c((Object) null);
                        return list3;
                    } catch (Throwable th4) {
                        th = th4;
                        va31Var.c((Object) null);
                        throw th;
                    }
                }
                cxc cxcVar = this.b;
                ico0 ico0Var = new ico0(b);
                ua31Var.a = riveAnimation;
                ua31Var.b = va31Var2;
                ua31Var.c = va31Var;
                ua31Var.d = i;
                ua31Var.g = 2;
                Serializable serializableN = mym.n(riveAnimation, cxcVar, ico0Var, ua31Var);
                if (serializableN != serializable) {
                    va31 va31Var6 = va31Var;
                    obj = serializableN;
                    va31Var4 = va31Var6;
                    riveAnimation2 = riveAnimation;
                    va31Var3 = va31Var2;
                    List list4 = (List) obj;
                    concurrentHashMap.put(riveAnimation2, list4);
                    concurrentHashMap2.remove(riveAnimation2, va31Var3);
                    va31Var4.c((Object) null);
                    return list4;
                }
                return serializable;
            } catch (Throwable th5) {
                th2 = th5;
                riveAnimation2 = riveAnimation;
                va31Var3 = va31Var2;
                concurrentHashMap2.remove(riveAnimation2, va31Var3);
                throw th2;
            }
        } catch (Throwable th6) {
            va31Var = this;
            th = th6;
        }
    }
}
