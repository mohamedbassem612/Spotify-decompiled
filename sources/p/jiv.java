package p;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jiv {
    public static final mnv0 e = new mnv0("dynamicnpvwidget_bitmap_keys");
    public static final mnv0 f = new mnv0("dynamicnpvwidget_process_id");
    public static final String g = UUID.randomUUID().toString();
    public final Context a;
    public final j380 b;
    public final ro30 c;
    public final rol1 d;

    public jiv(Context context, j380 j380Var, ro30 ro30Var, rol1 rol1Var) {
        this.a = context;
        this.b = j380Var;
        this.c = ro30Var;
        this.d = rol1Var;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(int i, String str, q961 q961Var, onm onmVar) throws Throwable {
        iiv iivVar;
        Object objY;
        div divVar;
        q961 q961Var2;
        int i2;
        kx5 kx5Var;
        l811 l811Var;
        q961 q961Var3;
        div divVar2;
        int i3;
        geo0 geo0Var;
        ymu ymuVar;
        int i4 = i;
        if (onmVar instanceof iiv) {
            iivVar = (iiv) onmVar;
            int i5 = iivVar.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iivVar.i = i5 - Integer.MIN_VALUE;
            } else {
                iivVar = new iiv(this, onmVar);
            }
        } else {
            iivVar = new iiv(this, onmVar);
        }
        iiv iivVar2 = iivVar;
        Object obj = iivVar2.g;
        int i6 = iivVar2.i;
        Context context = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i6 == 0) {
                hm5.M(obj);
                pt40 pt40Var = (pt40) this.b.get(str);
                div divVarA = pt40Var != null ? pt40Var.a(new y0u(0, this.d, rol1.class, "snapshot", "snapshot()Ljava/util/Map;", 0, (byte) 3)) : null;
                if (divVarA != null) {
                    ro30 ro30Var = this.c;
                    iivVar2.b = q961Var;
                    iivVar2.c = divVarA;
                    iivVar2.a = i4;
                    iivVar2.i = 1;
                    objY = fn31.Y((q8n) ro30Var.b, new nx5(ro30Var, i4, (lnm) null, (byte) 5), iivVar2);
                    if (objY != d9nVar) {
                        divVar = divVarA;
                        q961Var2 = q961Var;
                    }
                    return d9nVar;
                }
                return rih1Var;
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = iivVar2.a;
                    l811Var = iivVar2.e;
                    kx5 kx5Var2 = iivVar2.d;
                    divVar2 = iivVar2.c;
                    hm5.M(obj);
                    i2 = i7;
                    kx5Var = kx5Var2;
                    q961Var3 = null;
                    if (l811Var.a) {
                        try {
                            iivVar2.b = q961Var3;
                            iivVar2.c = q961Var3;
                            iivVar2.d = kx5Var;
                            iivVar2.e = q961Var3;
                            iivVar2.a = i2;
                            iivVar2.i = 3;
                            divVar2.getClass();
                            if (kx5Var != null || u2o1.o(kx5Var)) {
                                throw new IllegalArgumentException("Invalid Glance ID");
                            }
                            Object objE = ws40.e(divVar2, context, kx5Var.a, iivVar2);
                            if (objE != d9nVar) {
                                objE = rih1Var;
                            }
                            if (objE == d9nVar) {
                                return d9nVar;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i3 = i2;
                            geo0Var = geo0.b;
                            ymuVar = new ymu(this, kx5Var, q961Var3, (byte) 11);
                            iivVar2.b = q961Var3;
                            iivVar2.c = q961Var3;
                            iivVar2.d = q961Var3;
                            iivVar2.e = q961Var3;
                            iivVar2.f = th;
                            iivVar2.a = i3;
                            iivVar2.i = 4;
                            if (fn31.Y(geo0Var, ymuVar, iivVar2) != d9nVar) {
                                throw th;
                            }
                        }
                    }
                    return rih1Var;
                }
                if (i6 != 3) {
                    if (i6 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = iivVar2.f;
                    hm5.M(obj);
                    throw th2;
                }
                i3 = iivVar2.a;
                kx5 kx5Var3 = iivVar2.d;
                try {
                    hm5.M(obj);
                    return rih1Var;
                } catch (Throwable th3) {
                    th = th3;
                    kx5Var = kx5Var3;
                    q961Var3 = null;
                }
                geo0Var = geo0.b;
                ymuVar = new ymu(this, kx5Var, q961Var3, (byte) 11);
                iivVar2.b = q961Var3;
                iivVar2.c = q961Var3;
                iivVar2.d = q961Var3;
                iivVar2.e = q961Var3;
                iivVar2.f = th;
                iivVar2.a = i3;
                iivVar2.i = 4;
                if (fn31.Y(geo0Var, ymuVar, iivVar2) != d9nVar) {
                    return d9nVar;
                }
                throw th;
            }
            i4 = iivVar2.a;
            div divVar3 = iivVar2.c;
            q961 q961Var4 = iivVar2.b;
            hm5.M(obj);
            divVar = divVar3;
            objY = obj;
            q961Var2 = q961Var4;
            i2 = i4;
            kx5Var = (kx5) objY;
            l811Var = new l811();
            q961Var3 = null;
            sr1 sr1Var = new sr1(q961Var2, this, l811Var, q961Var3, (byte) 16);
            iivVar2.b = null;
            iivVar2.c = divVar;
            iivVar2.d = kx5Var;
            iivVar2.e = l811Var;
            iivVar2.a = i2;
            iivVar2.i = 2;
            if (y7y0.S(context, kx5Var, sr1Var, iivVar2) != d9nVar) {
                divVar2 = divVar;
                if (l811Var.a) {
                    iivVar2.b = q961Var3;
                    iivVar2.c = q961Var3;
                    iivVar2.d = kx5Var;
                    iivVar2.e = q961Var3;
                    iivVar2.a = i2;
                    iivVar2.i = 3;
                    divVar2.getClass();
                    if (kx5Var != null) {
                    }
                    throw new IllegalArgumentException("Invalid Glance ID");
                }
                return rih1Var;
            }
            return d9nVar;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }
}
