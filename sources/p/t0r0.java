package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class t0r0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0r0(hcr0 hcr0Var, byte b) {
        super(0, hcr0Var, hcr0.class, "getInternalReferrerName", "getInternalReferrerName()Ljava/lang/String;", 0);
        this.a = b;
        switch (b) {
            case 4:
                super(0, hcr0Var, hcr0.class, "requireActivity", "requireActivity()Landroidx/fragment/app/FragmentActivity;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    public final Object invoke() {
        zfe1 zfe1Var;
        String str;
        Integer numC0;
        int i;
        byte b = this.a;
        Long lValueOf = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((w0r0) ((lyc) this).receiver).p();
                return rih1Var;
            case 1:
                ((w0r0) ((lyc) this).receiver).f();
                return rih1Var;
            case 2:
                ((w0r0) ((lyc) this).receiver).p();
                return rih1Var;
            case 3:
                return ((hcr0) ((lyc) this).receiver).c1();
            case 4:
                return ((hcr0) ((lyc) this).receiver).N0();
            case 5:
                ((mko) ((lyc) this).receiver).start();
                return rih1Var;
            case 6:
                ((mko) ((lyc) this).receiver).stop();
                return rih1Var;
            case 7:
                ((zxu) ((lyc) this).receiver).c();
                return rih1Var;
            case 8:
                ((zxu) ((lyc) this).receiver).d();
                return rih1Var;
            case 9:
                ((oyu) ((lyc) this).receiver).a();
                return rih1Var;
            case 10:
                llm llmVar = ((oyu) ((lyc) this).receiver).n;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                    return rih1Var;
                }
                u890.C("coroutineScope");
                throw null;
            case 11:
                ((k740) ((lyc) this).receiver).c();
                return rih1Var;
            case 12:
                ((k740) ((lyc) this).receiver).e();
                return rih1Var;
            case 13:
                ((gst0) ((lyc) this).receiver).b();
                return rih1Var;
            case 14:
                ((gst0) ((lyc) this).receiver).c();
                return rih1Var;
            case 15:
                ((stt0) ((lyc) this).receiver).c();
                return rih1Var;
            case 16:
                ((stt0) ((lyc) this).receiver).d();
                return rih1Var;
            case 17:
                rrr0 rrr0Var = (rrr0) ((lyc) this).receiver;
                i8h1 i8h1Var = (i8h1) rrr0Var.b.getValue();
                txk0 txk0Var = rrr0Var.c;
                txk0Var.getClass();
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("birthday_input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 18:
                ((su01) ((lyc) this).receiver).f("decorate_parents");
                return rih1Var;
            case 19:
                ((qbs0) ((lyc) this).receiver).Z0().U(p200.a);
                return rih1Var;
            case 20:
                bow bowVar = (b650) ((lyc) this).receiver;
                bowVar.getClass();
                y0u y0uVar = new y0u(0, bowVar, bow.class, "readWithEgl", "readWithEgl()Lcom/spotify/campaigns/perf/api/Gpu;", 0, (byte) 5);
                AtomicReference atomicReference = new AtomicReference();
                Thread thread = new Thread((Runnable) new uu1(atomicReference, bowVar, y0uVar, (byte) 10), "CampaignsGpuInfoReader");
                thread.setDaemon(true);
                try {
                    thread.start();
                    thread.join(500L);
                    break;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Logger.e(e, "Interrupted while waiting for GPU information", new Object[0]);
                }
                q550 q550Var = (q550) atomicReference.get();
                return q550Var == null ? p550.a : q550Var;
            case 21:
                p3u0 p3u0Var = (p3u0) ((lyc) this).receiver;
                q590 q590Var = p3u0Var.c;
                if (p3u0Var.O0 && q590Var.q()) {
                    p3u0Var.u1 = true;
                    q590Var.a();
                }
                return rih1Var;
            case 22:
                p3u0 p3u0Var2 = (p3u0) ((lyc) this).receiver;
                if (p3u0Var2.O0 && p3u0Var2.u1) {
                    p3u0Var2.c.d();
                    p3u0Var2.u1 = false;
                }
                return rih1Var;
            case 23:
                return (d70) ((kly0) ((lyc) this).receiver).get();
            case 24:
                ((su01) ((lyc) this).receiver).f("decorate_playlists");
                return rih1Var;
            case 25:
                return ((pk00) ((lyc) this).receiver).a();
            case 26:
                return ((pk00) ((lyc) this).receiver).a();
            case 27:
                return ((pk00) ((lyc) this).receiver).a();
            case 28:
                mrw0 mrw0Var = (mrw0) ((lyc) this).receiver;
                gx21 gx21Var = mrw0Var.b;
                esi0 esi0Var = (esi0) gx21Var.a.invoke();
                int i2 = 7;
                if (esi0Var != null) {
                    long j = esi0Var.b;
                    if (j > 0) {
                        double d = esi0Var.a / j;
                        boolean z = esi0Var.c;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 6) {
                                i = 1;
                            } else if (d < b3e0.f[i3]) {
                                i = 7 - i3;
                            } else {
                                i3++;
                            }
                        }
                        if (z && i < 6) {
                            i = 6;
                        }
                        gx21Var.c = i;
                    }
                }
                se11 se11Var = gx21.h;
                String str2 = (String) gx21Var.b.invoke();
                if (str2 == null) {
                    zfe1Var = age1.a;
                } else {
                    int iA0 = ihc1.A0(str2, ')', 0, 6);
                    if (iA0 == -1 || (str = (String) o7h.t0(17, se11Var.h(ihc1.e1(str2.substring(iA0 + 1)).toString()))) == null || (numC0 = nhc1.c0(str)) == null || numC0.intValue() <= 0) {
                        numC0 = null;
                    }
                    if (numC0 != null) {
                        zfe1Var = new zfe1(numC0.intValue());
                    } else {
                        zfe1Var = age1.a;
                    }
                }
                gx21Var.e = zfe1Var;
                if (str2 != null) {
                    int iA1 = ihc1.A0(str2, ')', 0, 6);
                    if (iA1 != -1) {
                        List listH = se11Var.h(ihc1.e1(str2.substring(iA1 + 1)).toString());
                        if (listH.size() >= 12) {
                            try {
                                lValueOf = Long.valueOf(Long.parseLong((String) listH.get(11)) + Long.parseLong((String) listH.get(12)));
                            } catch (NumberFormatException e2) {
                                Logger.l(e2, "Failed to parse utime and stime from %s", new Object[]{"/proc/self/stat"});
                            }
                        }
                    }
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        long jLongValue2 = ((Number) z4e0.a.invoke()).longValue();
                        long j2 = gx21Var.f;
                        long j3 = gx21Var.g;
                        gx21Var.f = jLongValue;
                        gx21Var.g = jLongValue2;
                        double dDoubleValue = ((Number) b5e0.j.getValue()).doubleValue();
                        if (j2 >= 0 && j3 >= 0 && jLongValue2 > j3 && dDoubleValue > 0.0d) {
                            long j4 = jLongValue - j2;
                            double d2 = ((j4 < 0 ? 0L : j4) / dDoubleValue) / ((jLongValue2 - j3) / 1000.0d);
                            for (int i4 = 0; i4 < 6; i4++) {
                                if (d2 <= b3e0.g[i4]) {
                                    i2 = i4 + 1;
                                    gx21Var.d = i2;
                                }
                            }
                            gx21Var.d = i2;
                        }
                    }
                    break;
                }
                mrw0Var.a();
                bge1 bge1Var = gx21Var.e;
                if (bge1Var != null && !bge1Var.equals(mrw0Var.f)) {
                    mrw0Var.f = bge1Var;
                    mrw0Var.d.invoke(bge1Var);
                }
                return rih1Var;
            default:
                return ((d2u) ((lyc) this).receiver).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0r0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
