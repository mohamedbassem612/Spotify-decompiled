package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.concertcampaignview.v1.CampaignActionResponse;
import com.spotify.concertcampaignview.v1.CampaignCard;
import com.spotify.venueview.v1.ContentRow;
import com.spotify.venueview.v1.GetConcertsAtVenueNextPageRequest;
import com.spotify.venueview.v1.GetConcertsAtVenueNextPageResponse;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nx extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public int d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(int i, zja1 zja1Var, aka1 aka1Var, o95 o95Var, n8b1 n8b1Var, o95 o95Var2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.d = i;
        this.f = zja1Var;
        this.g = aka1Var;
        this.h = o95Var;
        this.i = n8b1Var;
        this.e = o95Var2;
        this.c = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:18:0x0052, B:54:0x0107, B:56:0x010d, B:57:0x0114, B:13:0x003c, B:21:0x0065, B:37:0x00bb, B:39:0x00c1, B:40:0x00c8), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010d A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:18:0x0052, B:54:0x0107, B:56:0x010d, B:57:0x0114, B:13:0x003c, B:21:0x0065, B:37:0x00bb, B:39:0x00c1, B:40:0x00c8), top: B:68:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0146 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.dg8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, p.vr20] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, p.vr20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, p.vr20] */
    private final Object e(Object obj) {
        j7k j7kVar;
        int i;
        j7k j7kVar2;
        int i2;
        ?? r3;
        n8k n8kVar;
        String string;
        ?? r4;
        n8k n8kVar2;
        String string2;
        Context context = (Context) this.h;
        ?? r2 = (dg8) this.g;
        ?? r5 = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (r5 != 0) {
                if (r5 == 1) {
                    i2 = this.d;
                    vr20 vr20Var = (vr20) this.e;
                    j7kVar2 = (j7k) this.i;
                    hm5.M(obj);
                    r3 = vr20Var;
                    string = j7kVar2.f;
                    if (string == null) {
                        string = context.getString(2131954189);
                    }
                    n8kVar = new n8k(string);
                    this.c = null;
                    this.i = null;
                    this.e = r3;
                    this.d = i2;
                    this.b = (byte) 2;
                    if (r3.emit(n8kVar, this) != d9nVar) {
                        return d9nVar;
                    }
                } else if (r5 == 2) {
                    int i3 = this.d;
                    hm5.M(obj);
                } else if (r5 == 3) {
                    i = this.d;
                    vr20 vr20Var2 = (vr20) this.e;
                    j7kVar = (j7k) this.i;
                    hm5.M(obj);
                    r4 = vr20Var2;
                    string2 = j7kVar.e;
                    if (string2 == null) {
                        string2 = context.getString(2131954191);
                    }
                    n8kVar2 = new n8k(string2);
                    this.c = null;
                    this.i = null;
                    this.e = r4;
                    this.d = i;
                    this.b = (byte) 4;
                    if (r4.emit(n8kVar2, this) != d9nVar) {
                        return d9nVar;
                    }
                } else if (r5 == 4) {
                    int i4 = this.d;
                    hm5.M(obj);
                } else {
                    if (r5 != 5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            }
            hm5.M(obj);
            r5 = (vr20) this.c;
            j7k j7kVar3 = (j7k) this.f;
            try {
                boolean z = j7kVar3.c;
                String str = j7kVar3.a;
                if (z) {
                    List listSingletonList = Collections.singletonList(str);
                    this.c = null;
                    this.i = j7kVar3;
                    this.e = r5;
                    this.d = 0;
                    this.b = (byte) 1;
                    w5h w5hVar = w5h.c;
                    w4h w4hVar = (w4h) ((dg8) r2).b;
                    u4h u4hVarQ = CollectionPlatformItemsRequest.q();
                    u4hVarQ.n(listSingletonList);
                    u4hVarQ.t(w5hVar);
                    Object objI = fc11.i(w4hVar.b(u4hVarQ.build()).ignoreElement(), this);
                    if (objI != d9nVar) {
                        objI = rih1Var;
                    }
                    if (objI != d9nVar) {
                        objI = rih1Var;
                    }
                    if (objI != d9nVar) {
                        j7kVar2 = j7kVar3;
                        i2 = 0;
                        r3 = r5;
                        string = j7kVar2.f;
                        if (string == null) {
                            string = context.getString(2131954189);
                        }
                        n8kVar = new n8k(string);
                        this.c = null;
                        this.i = null;
                        this.e = r3;
                        this.d = i2;
                        this.b = (byte) 2;
                        if (r3.emit(n8kVar, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } else {
                    List listI0 = j7kVar3.d ? f46.i0(new String[]{str, j7kVar3.b}) : Collections.singletonList(str);
                    this.c = null;
                    this.i = j7kVar3;
                    this.e = r5;
                    this.d = 0;
                    this.b = (byte) 3;
                    if (r2.f(listI0, this) != d9nVar) {
                        j7kVar = j7kVar3;
                        i = 0;
                        r4 = r5;
                        string2 = j7kVar.e;
                        if (string2 == null) {
                            string2 = context.getString(2131954191);
                        }
                        n8kVar2 = new n8k(string2);
                        this.c = null;
                        this.i = null;
                        this.e = r4;
                        this.d = i;
                        this.b = (byte) 4;
                        if (r4.emit(n8kVar2, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                }
            } catch (Exception e) {
                e = e;
                r2 = 0;
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to update reminder";
                }
                o8k o8kVar = new o8k(message);
                this.c = null;
                this.i = null;
                this.e = null;
                this.d = r2;
                this.b = (byte) 5;
                if (r5.emit(o8kVar, this) == d9nVar) {
                    return d9nVar;
                }
            }
            return d9nVar;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        if (r2.emit(r6, r11) == r4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nx.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r5.emit(r0, r12) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r5.emit(r0, r12) == r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.h
            com.spotify.mobius.functions.Consumer r0 = (com.spotify.mobius.functions.Consumer) r0
            java.lang.Object r1 = r12.g
            p.mu10 r1 = (p.mu10) r1
            byte r2 = r12.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L28
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            goto L1f
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r6
        L1f:
            java.lang.Object r12 = r12.c
            p.vr20 r12 = (p.vr20) r12
            p.hm5.M(r13)
            goto Lbc
        L28:
            int r2 = r12.d
            java.lang.Object r5 = r12.e
            p.vr20 r5 = (p.vr20) r5
            java.lang.Object r8 = r12.i
            p.dt10 r8 = (p.dt10) r8
            java.lang.Object r9 = r12.c
            p.vr20 r9 = (p.vr20) r9
            p.hm5.M(r13)
            goto L61
        L3a:
            p.hm5.M(r13)
            java.lang.Object r13 = r12.c
            p.vr20 r13 = (p.vr20) r13
            java.lang.Object r2 = r12.f
            r8 = r2
            p.dt10 r8 = (p.dt10) r8
            p.m7o0 r2 = r1.b
            java.lang.String r9 = r8.a
            java.lang.String r10 = r8.b
            r12.c = r6
            r12.i = r8
            r12.e = r13
            r11 = 0
            r12.d = r11
            r12.b = r5
            java.lang.Object r2 = r2.a(r9, r10, r12)
            if (r2 != r7) goto L5e
            goto Lbb
        L5e:
            r5 = r13
            r13 = r2
            r2 = r11
        L61:
            p.uw10 r13 = (p.uw10) r13
            boolean r9 = r13 instanceof p.tw10
            if (r9 == 0) goto L87
            p.lv10 r0 = new p.lv10
            p.tw10 r13 = (p.tw10) r13
            java.lang.String r1 = r13.b
            java.lang.Object r13 = r13.a
            p.nw10 r13 = (p.nw10) r13
            boolean r13 = r13.b
            r0.<init>(r1, r13)
            r12.c = r6
            r12.i = r6
            r12.e = r6
            r12.d = r2
            r12.b = r4
            java.lang.Object r12 = r5.emit(r0, r12)
            if (r12 != r7) goto Lbc
            goto Lbb
        L87:
            boolean r4 = r13 instanceof p.sw10
            if (r4 == 0) goto Lbf
            p.sw10 r13 = (p.sw10) r13
            boolean r4 = r13.a
            if (r4 == 0) goto La4
            p.fpo r9 = new p.fpo
            r10 = 6
            r9.<init>(r1, r8, r6, r10)
            p.m42 r8 = new p.m42
            r10 = 16
            r8.<init>(r0, r10)
            r10 = 2131963074(0x7f132cc2, float:1.9562891E38)
            r1.a(r0, r10, r9, r8)
        La4:
            p.zu10 r0 = new p.zu10
            java.lang.String r13 = r13.b
            r0.<init>(r4, r13)
            r12.c = r6
            r12.i = r6
            r12.e = r6
            r12.d = r2
            r12.b = r3
            java.lang.Object r12 = r5.emit(r0, r12)
            if (r12 != r7) goto Lbc
        Lbb:
            return r7
        Lbc:
            p.rih1 r12 = p.rih1.a
            return r12
        Lbf:
            p.eg.o()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nx.h(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: Exception -> 0x0078, CancellationException -> 0x0131, TryCatch #1 {CancellationException -> 0x0131, blocks: (B:9:0x001f, B:16:0x003f, B:61:0x0103, B:21:0x0058, B:38:0x0095, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:49:0x00b5, B:52:0x00cd, B:53:0x00d2, B:54:0x00d3, B:56:0x00f2, B:57:0x00f5, B:26:0x006d, B:28:0x0071, B:30:0x0075, B:34:0x007d), top: B:71:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[Catch: Exception -> 0x0078, CancellationException -> 0x0131, TryCatch #1 {CancellationException -> 0x0131, blocks: (B:9:0x001f, B:16:0x003f, B:61:0x0103, B:21:0x0058, B:38:0x0095, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:49:0x00b5, B:52:0x00cd, B:53:0x00d2, B:54:0x00d3, B:56:0x00f2, B:57:0x00f5, B:26:0x006d, B:28:0x0071, B:30:0x0075, B:34:0x007d), top: B:71:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd A[Catch: Exception -> 0x0078, CancellationException -> 0x0131, TryCatch #1 {CancellationException -> 0x0131, blocks: (B:9:0x001f, B:16:0x003f, B:61:0x0103, B:21:0x0058, B:38:0x0095, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:49:0x00b5, B:52:0x00cd, B:53:0x00d2, B:54:0x00d3, B:56:0x00f2, B:57:0x00f5, B:26:0x006d, B:28:0x0071, B:30:0x0075, B:34:0x007d), top: B:71:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[Catch: Exception -> 0x0078, CancellationException -> 0x0131, TryCatch #1 {CancellationException -> 0x0131, blocks: (B:9:0x001f, B:16:0x003f, B:61:0x0103, B:21:0x0058, B:38:0x0095, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:49:0x00b5, B:52:0x00cd, B:53:0x00d2, B:54:0x00d3, B:56:0x00f2, B:57:0x00f5, B:26:0x006d, B:28:0x0071, B:30:0x0075, B:34:0x007d), top: B:71:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[Catch: Exception -> 0x0078, CancellationException -> 0x0131, TryCatch #1 {CancellationException -> 0x0131, blocks: (B:9:0x001f, B:16:0x003f, B:61:0x0103, B:21:0x0058, B:38:0x0095, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:46:0x00ab, B:49:0x00b5, B:52:0x00cd, B:53:0x00d2, B:54:0x00d3, B:56:0x00f2, B:57:0x00f5, B:26:0x006d, B:28:0x0071, B:30:0x0075, B:34:0x007d), top: B:71:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
    
        if (r2.emit(r4, r12) == r7) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nx.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    private final Object j(Object obj) {
        String str;
        lhg1 lhg1Var = (lhg1) this.g;
        res resVar = (res) this.f;
        ldk0 ldk0Var = (cdk0) resVar.d;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.b = (byte) 1;
            if (ldk0Var.h(this) != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        if (!hmk0.d((ven0) this.h)) {
            ((ven0) this.i).setValue(new Integer(this.d));
            ((frr0) this.e).t(lhg1Var.b.i);
            ((frr0) this.c).t(lhg1Var.b.X);
            str = ((c0k0) resVar.e).a;
            this.b = (byte) 3;
            if (cdk0.a(ldk0Var, lhg1Var, str, this) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        lt20 lt20VarG = ldk0Var.g();
        fca0 fca0Var = new fca0(2, (lnm) null, (byte) 24);
        this.b = (byte) 2;
        if (b5p1.j(lt20VarG, fca0Var, this) != d9nVar) {
            if (!hmk0.d((ven0) this.h)) {
                ((ven0) this.i).setValue(new Integer(this.d));
                ((frr0) this.e).t(lhg1Var.b.i);
                ((frr0) this.c).t(lhg1Var.b.X);
                str = ((c0k0) resVar.e).a;
                this.b = (byte) 3;
                if (cdk0.a(ldk0Var, lhg1Var, str, this) == d9nVar) {
                }
            }
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (p.smo1.s(r4, r10) == r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.b
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p.hm5.M(r11)
            goto L56
        L10:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L17:
            p.hm5.M(r11)
            goto L2a
        L1b:
            p.hm5.M(r11)
            int r11 = r10.d
            long r4 = (long) r11
            r10.b = r2
            java.lang.Object r11 = p.hap1.i(r4, r10)
            if (r11 != r3) goto L2a
            goto L55
        L2a:
            java.lang.Object r11 = r10.f
            p.zja1 r11 = (p.zja1) r11
            java.lang.Object r0 = r10.g
            p.aka1 r0 = (p.aka1) r0
            p.fw80 r2 = p.fw80.a
            p.bka1.b(r11, r0, r2)
            p.c6h0 r4 = new p.c6h0
            java.lang.Object r11 = r10.h
            r5 = r11
            p.o95 r5 = (p.o95) r5
            java.lang.Object r11 = r10.i
            r6 = r11
            p.n8b1 r6 = (p.n8b1) r6
            java.lang.Object r11 = r10.e
            r7 = r11
            p.o95 r7 = (p.o95) r7
            r8 = 0
            r9 = 2
            r4.<init>(r5, r6, r7, r8, r9)
            r10.b = r1
            java.lang.Object r11 = p.smo1.s(r4, r10)
            if (r11 != r3) goto L56
        L55:
            return r3
        L56:
            java.lang.Object r10 = r10.c
            p.ven0 r10 = (p.ven0) r10
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.setValue(r11)
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nx.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[PHI: r0 r1
      0x0072: PHI (r0v24 int) = (r0v29 int), (r0v30 int) binds: [B:23:0x0070, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r1v4 java.lang.Throwable) = (r1v8 java.lang.Throwable), (r1v9 java.lang.Throwable) binds: [B:23:0x0070, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:25:0x0074, B:32:0x0097, B:39:0x00b7, B:35:0x00a2, B:38:0x00aa, B:28:0x0086, B:31:0x0090), top: B:79:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:25:0x0074, B:32:0x0097, B:39:0x00b7, B:35:0x00a2, B:38:0x00aa, B:28:0x0086, B:31:0x0090), top: B:79:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:25:0x0074, B:32:0x0097, B:39:0x00b7, B:35:0x00a2, B:38:0x00aa, B:28:0x0086, B:31:0x0090), top: B:79:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[Catch: all -> 0x001b, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x001b, blocks: (B:7:0x0014, B:43:0x00cc, B:44:0x00d8, B:47:0x00e7, B:50:0x00f3, B:54:0x00fa, B:45:0x00d9, B:49:0x00e9), top: B:81:0x0014, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9 A[Catch: all -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:45:0x00d9, B:49:0x00e9), top: B:77:0x00d9, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cb -> B:43:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00fe -> B:16:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object o(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nx.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (p.fn31.Y(r9, r1, r8) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r3.emit(p.e7i1.a, r8) == r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.b
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L30
            if (r0 == r3) goto L20
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            goto L17
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L17:
            java.lang.Object r8 = r8.c
            p.vr20 r8 = (p.vr20) r8
            p.hm5.M(r9)
            goto L9d
        L20:
            int r0 = r8.d
            java.lang.Object r3 = r8.e
            p.vr20 r3 = (p.vr20) r3
            java.lang.Object r6 = r8.c
            p.vr20 r6 = (p.vr20) r6
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r9 = move-exception
            goto L61
        L30:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.c
            p.vr20 r9 = (p.vr20) r9
            java.lang.Object r0 = r8.f
            p.y6i1 r0 = (p.y6i1) r0
            r6 = 0
            java.lang.Object r7 = r8.g     // Catch: java.lang.Throwable -> L5f
            p.bfd r7 = (p.bfd) r7     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L5f
            r8.c = r4     // Catch: java.lang.Throwable -> L5f
            r8.e = r9     // Catch: java.lang.Throwable -> L5f
            r8.d = r6     // Catch: java.lang.Throwable -> L5f
            r8.b = r3     // Catch: java.lang.Throwable -> L5f
            p.nad r3 = r7.b     // Catch: java.lang.Throwable -> L5f
            com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus r7 = com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r3.F(r0, r7, r8)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r5) goto L55
            goto L9c
        L55:
            r3 = r9
            r9 = r0
            r0 = r6
        L58:
            p.goe r9 = (p.goe) r9     // Catch: java.lang.Throwable -> L2e
            goto L67
        L5b:
            r3 = r9
            r9 = r0
            r0 = r6
            goto L61
        L5f:
            r0 = move-exception
            goto L5b
        L61:
            p.m231 r6 = new p.m231
            r6.<init>(r9)
            r9 = r6
        L67:
            java.lang.Throwable r6 = p.e331.a(r9)
            if (r6 != 0) goto L8c
            p.goe r9 = (p.goe) r9
            java.lang.Object r9 = r8.h
            p.q8n r9 = (p.q8n) r9
            p.fik r1 = new p.fik
            java.lang.Object r3 = r8.i
            p.lzn0 r3 = (p.lzn0) r3
            r6 = 4
            r1.<init>(r3, r4, r6)
            r8.c = r4
            r8.e = r4
            r8.d = r0
            r8.b = r2
            java.lang.Object r8 = p.fn31.Y(r9, r1, r8)
            if (r8 != r5) goto L9d
            goto L9c
        L8c:
            r8.c = r4
            r8.e = r4
            r8.d = r0
            r8.b = r1
            p.e7i1 r9 = p.e7i1.a
            java.lang.Object r8 = r3.emit(r9, r8)
            if (r8 != r5) goto L9d
        L9c:
            return r5
        L9d:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nx.p(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                nx nxVar = new nx((ox) this.g, lnmVar);
                nxVar.c = obj;
                return nxVar;
            case 1:
                nx nxVar2 = new nx((dg8) this.h, (q59) this.i, this.d, (Set) this.e, lnmVar);
                nxVar2.c = obj;
                return nxVar2;
            case 2:
                nx nxVar3 = new nx((u7h) this.h, (q59) this.i, (by9) this.e, lnmVar);
                nxVar3.c = obj;
                return nxVar3;
            case 3:
                nx nxVar4 = new nx((pcd) this.i, (zu90) this.e, lnmVar);
                nxVar4.c = obj;
                return nxVar4;
            case 4:
                nx nxVar5 = new nx(this.f, lnmVar, this.g, (byte) 4);
                nxVar5.c = obj;
                return nxVar5;
            case 5:
                nx nxVar6 = new nx(this.f, lnmVar, this.g, this.h, (byte) 5);
                nxVar6.c = obj;
                return nxVar6;
            case 6:
                nx nxVar7 = new nx(this.f, lnmVar, this.g, this.h, (byte) 6);
                nxVar7.c = obj;
                return nxVar7;
            case 7:
                nx nxVar8 = new nx(this.f, lnmVar, this.g, this.h, (byte) 7);
                nxVar8.c = obj;
                return nxVar8;
            case 8:
                nx nxVar9 = new nx(this.f, lnmVar, this.g, this.h, (byte) 8);
                nxVar9.c = obj;
                return nxVar9;
            case 9:
                nx nxVar10 = new nx(this.f, lnmVar, this.g, (byte) 9);
                nxVar10.c = obj;
                return nxVar10;
            case 10:
                return new nx((res) this.f, this.d, (lhg1) this.g, (ven0) this.h, (ven0) this.i, (frr0) this.e, (frr0) this.c, lnmVar);
            case 11:
                return new nx(this.d, (zja1) this.f, (aka1) this.g, (o95) this.h, (n8b1) this.i, (o95) this.e, (ven0) this.c, lnmVar);
            case 12:
                return new nx((xu30) this.g, (Context) this.h, (qcf0) this.i, (String) this.e, (ven0) this.c, lnmVar);
            case 13:
                nx nxVar11 = new nx(this.f, lnmVar, (bfd) this.g, (q8n) this.h, (lzn0) this.i);
                nxVar11.c = obj;
                return nxVar11;
            default:
                nx nxVar12 = new nx(this.f, lnmVar, this.g, this.h, (byte) 14);
                nxVar12.c = obj;
                return nxVar12;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02af A[Catch: Exception -> 0x02d6, TryCatch #7 {Exception -> 0x02d6, blocks: (B:134:0x02f3, B:136:0x02fd, B:139:0x0302, B:131:0x02db, B:121:0x02a3, B:123:0x02af), top: B:367:0x02a3 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02da  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f3 A[Catch: Exception -> 0x02d6, PHI: r0 r4 r7 r9
      0x02f3: PHI (r0v103 java.lang.Object) = (r0v90 java.lang.Object), (r0v107 java.lang.Object) binds: [B:105:0x0245, B:132:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r4v37 p.vr20) = (r4v34 p.vr20), (r4v38 p.vr20) binds: [B:105:0x0245, B:132:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r7v36 int) = (r7v34 int), (r7v37 int) binds: [B:105:0x0245, B:132:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r9v47 p.x6k) = (r9v46 p.x6k), (r9v49 p.x6k) binds: [B:105:0x0245, B:132:0x02f0] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {Exception -> 0x02d6, blocks: (B:134:0x02f3, B:136:0x02fd, B:139:0x0302, B:131:0x02db, B:121:0x02a3, B:123:0x02af), top: B:367:0x02a3 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02fd A[Catch: Exception -> 0x02d6, TryCatch #7 {Exception -> 0x02d6, blocks: (B:134:0x02f3, B:136:0x02fd, B:139:0x0302, B:131:0x02db, B:121:0x02a3, B:123:0x02af), top: B:367:0x02a3 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x032d  */
    /* JADX WARN: Code duplicated, block: B:234:0x053d A[Catch: Exception -> 0x0573, CancellationException -> 0x05ac, TryCatch #5 {CancellationException -> 0x05ac, blocks: (B:224:0x050c, B:232:0x0535, B:234:0x053d, B:237:0x054f, B:238:0x0556, B:240:0x055c, B:242:0x0575, B:245:0x0587, B:246:0x058e, B:248:0x0594, B:228:0x0519), top: B:364:0x04f2 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x054e  */
    /* JADX WARN: Code duplicated, block: B:240:0x055c A[Catch: Exception -> 0x0573, CancellationException -> 0x05ac, LOOP:6: B:238:0x0556->B:240:0x055c, LOOP_END, TryCatch #5 {CancellationException -> 0x05ac, blocks: (B:224:0x050c, B:232:0x0535, B:234:0x053d, B:237:0x054f, B:238:0x0556, B:240:0x055c, B:242:0x0575, B:245:0x0587, B:246:0x058e, B:248:0x0594, B:228:0x0519), top: B:364:0x04f2 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x0575 A[Catch: Exception -> 0x0573, CancellationException -> 0x05ac, TryCatch #5 {CancellationException -> 0x05ac, blocks: (B:224:0x050c, B:232:0x0535, B:234:0x053d, B:237:0x054f, B:238:0x0556, B:240:0x055c, B:242:0x0575, B:245:0x0587, B:246:0x058e, B:248:0x0594, B:228:0x0519), top: B:364:0x04f2 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x0586  */
    /* JADX WARN: Code duplicated, block: B:248:0x0594 A[Catch: Exception -> 0x0573, CancellationException -> 0x05ac, LOOP:7: B:246:0x058e->B:248:0x0594, LOOP_END, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x05ac, blocks: (B:224:0x050c, B:232:0x0535, B:234:0x053d, B:237:0x054f, B:238:0x0556, B:240:0x055c, B:242:0x0575, B:245:0x0587, B:246:0x058e, B:248:0x0594, B:228:0x0519), top: B:364:0x04f2 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:261:0x05cd A[LOOP:8: B:259:0x05c7->B:261:0x05cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x06bd A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:298:0x06c6 A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:300:0x06ce A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:302:0x06d2 A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:304:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:305:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:309:0x0714 A[Catch: all -> 0x0624, LOOP:11: B:307:0x070e->B:309:0x0714, LOOP_END, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0745  */
    /* JADX WARN: Code duplicated, block: B:316:0x0760 A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:321:0x0779 A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:323:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:324:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:328:0x07bc A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:330:0x07cc A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:331:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:336:0x07f3 A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0813  */
    /* JADX WARN: Code duplicated, block: B:339:0x0814  */
    /* JADX WARN: Code duplicated, block: B:342:0x0833  */
    /* JADX WARN: Code duplicated, block: B:343:0x0834  */
    /* JADX WARN: Code duplicated, block: B:345:0x0837  */
    /* JADX WARN: Code duplicated, block: B:346:0x0838 A[Catch: all -> 0x0624, TryCatch #3 {all -> 0x0624, blocks: (B:271:0x061f, B:276:0x0633, B:340:0x0815, B:279:0x0644, B:325:0x07a9, B:326:0x07b6, B:328:0x07bc, B:330:0x07cc, B:333:0x07e9, B:334:0x07ed, B:336:0x07f3, B:282:0x0660, B:313:0x0747, B:314:0x075a, B:316:0x0760, B:318:0x076f, B:319:0x0773, B:321:0x0779, B:285:0x0676, B:306:0x06fd, B:307:0x070e, B:309:0x0714, B:310:0x0720, B:288:0x0683, B:295:0x06b1, B:297:0x06bd, B:298:0x06c6, B:300:0x06ce, B:302:0x06d2, B:346:0x0838, B:347:0x083d, B:291:0x0693), top: B:361:0x05fe }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0849  */
    /* JADX WARN: Code duplicated, block: B:395:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x07b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x075a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable thA;
        Object objJ;
        ox oxVar;
        int i;
        ufg0 ufg0Var;
        wqn1 wqn1Var;
        Object objJ2;
        ufg0 ufg0Var2;
        int i2;
        ox oxVar2;
        wqn1 wqn1Var2;
        ArrayList arrayList;
        Iterator it;
        Set setP1;
        Object objY;
        LinkedHashSet linkedHashSetY0;
        ArrayList arrayList2;
        ox oxVar3;
        Object objS;
        ox oxVar4;
        ArrayList arrayList3;
        Single singleH;
        ox oxVar5;
        u7g0 u7g0Var;
        di8 di8Var;
        u4i1 u4i1Var;
        Object objY2;
        Object objC;
        vr20 vr20Var;
        LinkedHashMap linkedHashMap;
        List list;
        LinkedHashMap linkedHashMap2;
        int iS;
        int iS2;
        int iG;
        Object obj2;
        l2t l2tVarQ;
        Object objQ;
        Uri uri;
        Object objE;
        pcd pcdVar;
        vgn0 vgn0Var;
        zu90 zu90Var;
        vgn0 vgn0Var2;
        Object objD;
        vr20 vr20Var2;
        yxe yxeVar;
        gxz0 gxz0Var;
        Object objI;
        vr20 vr20Var3;
        int i3;
        vr20 vr20Var4;
        x6k x6kVar;
        Object objM;
        int i4;
        vr20 vr20Var5;
        x6k x6kVar2;
        Object objX;
        o8k o8kVar;
        String message;
        xrk xrkVar;
        j8k j8kVar;
        CampaignActionResponse campaignActionResponse;
        n8k n8kVar;
        vr20 vr20Var6;
        bwi1 bwi1Var;
        vf51 vf51Var;
        Object objA;
        Object next;
        GetConcertsAtVenueNextPageResponse getConcertsAtVenueNextPageResponse;
        GetConcertsAtVenueNextPageResponse getConcertsAtVenueNextPageResponse2;
        byte b = this.a;
        int i5 = 10;
        m231 m231Var = rih1.a;
        d9n d9nVar = d9n.a;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        z = false;
        boolean z = false;
        int i9 = 0;
        switch (b) {
            case 0:
                try {
                    switch (this.b) {
                        case 0:
                            hm5.M(obj);
                            ox oxVar6 = (ox) this.g;
                            Single singleA = ((hgg0) oxVar6.d.get()).a();
                            this.c = null;
                            this.f = oxVar6;
                            this.d = 0;
                            this.b = (byte) 1;
                            objJ = fc11.j(singleA, this);
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                            oxVar = oxVar6;
                            i = 0;
                            ufg0Var = (ufg0) objJ;
                            wqn1Var = ufg0Var.a;
                            if (wqn1Var.equals(fhg0.i)) {
                                Logger.d("Error fetching managed accounts", new Object[0]);
                            } else if (!wqn1Var.equals(ghg0.i)) {
                                if (wqn1Var instanceof hhg0) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Single singleK = ((jq) oxVar.b.get()).k();
                                this.c = null;
                                this.f = oxVar;
                                this.h = wqn1Var;
                                this.i = ufg0Var;
                                this.d = i;
                                this.b = (byte) 2;
                                objJ2 = fc11.j(singleK, this);
                                if (objJ2 == d9nVar) {
                                    return d9nVar;
                                }
                                int i10 = i;
                                ufg0Var2 = ufg0Var;
                                i2 = i10;
                                oxVar2 = oxVar;
                                wqn1Var2 = wqn1Var;
                                Iterable iterable = (Iterable) objJ2;
                                arrayList = new ArrayList(q7h.U(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ev) it.next()).a);
                                }
                                setP1 = o7h.p1(arrayList);
                                cue0 cue0Var = oxVar2.c;
                                this.c = null;
                                this.f = oxVar2;
                                this.h = wqn1Var2;
                                this.i = ufg0Var2;
                                this.e = setP1;
                                this.d = i2;
                                this.b = (byte) 3;
                                objY = fn31.Y(cue0Var.b, new iyb0(cue0Var, (lnm) null, (byte) 7), this);
                                if (objY == d9nVar) {
                                    return d9nVar;
                                }
                                linkedHashSetY0 = dm61.y0(setP1, (Iterable) objY);
                                ArrayList arrayList4 = ((hhg0) wqn1Var2).i;
                                arrayList2 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (!linkedHashSetY0.contains(((u7g0) obj3).b)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    of8 of8Var = ufg0Var2.b;
                                    this.c = null;
                                    this.f = oxVar2;
                                    this.h = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i2;
                                    this.b = (byte) 4;
                                    bma1 bma1Var = ox.h;
                                    oxVar2.getClass();
                                    oxVar3 = oxVar2;
                                    objS = smo1.s(new bh(arrayList2, oxVar3, of8Var, (lnm) null, (byte) 2), this);
                                    if (objS == d9nVar) {
                                        return d9nVar;
                                    }
                                    oxVar4 = oxVar3;
                                    arrayList3 = new ArrayList();
                                    for (mmr0 mmr0Var : (List) objS) {
                                        u7g0Var = (u7g0) mmr0Var.a;
                                        di8Var = (di8) mmr0Var.b;
                                        if (di8Var != null) {
                                            u4i1Var = new u4i1(di8Var, di8Var.a, u7g0Var.c, u7g0Var.d, u7g0Var.e);
                                        } else {
                                            u4i1Var = null;
                                        }
                                        if (u4i1Var != null) {
                                            arrayList3.add(u4i1Var);
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        singleH = ((oq) oxVar4.a.get()).h(arrayList3);
                                        this.c = null;
                                        this.f = oxVar4;
                                        this.h = null;
                                        this.i = null;
                                        this.e = null;
                                        this.d = i2;
                                        this.b = (byte) 5;
                                        if (fc11.j(singleH, this) == d9nVar) {
                                            return d9nVar;
                                        }
                                        oxVar5 = oxVar4;
                                        this.c = null;
                                        this.f = null;
                                        this.h = null;
                                        this.i = null;
                                        this.e = null;
                                        this.d = i2;
                                        this.b = (byte) 6;
                                        bma1 bma1Var2 = ox.h;
                                        objY2 = fn31.Y(oxVar5.g, new lx(oxVar5, null, (byte) 1), this);
                                        if (objY2 == d9nVar) {
                                            objY2 = m231Var;
                                        }
                                        if (objY2 == d9nVar) {
                                            return d9nVar;
                                        }
                                    }
                                }
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        case 1:
                            int i11 = this.d;
                            ox oxVar7 = (ox) this.f;
                            hm5.M(obj);
                            oxVar = oxVar7;
                            i = i11;
                            objJ = obj;
                            ufg0Var = (ufg0) objJ;
                            wqn1Var = ufg0Var.a;
                            if (wqn1Var.equals(fhg0.i)) {
                                Logger.d("Error fetching managed accounts", new Object[0]);
                            } else if (!wqn1Var.equals(ghg0.i)) {
                                if (wqn1Var instanceof hhg0) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Single singleK2 = ((jq) oxVar.b.get()).k();
                                this.c = null;
                                this.f = oxVar;
                                this.h = wqn1Var;
                                this.i = ufg0Var;
                                this.d = i;
                                this.b = (byte) 2;
                                objJ2 = fc11.j(singleK2, this);
                                if (objJ2 == d9nVar) {
                                    return d9nVar;
                                }
                                int i12 = i;
                                ufg0Var2 = ufg0Var;
                                i2 = i12;
                                oxVar2 = oxVar;
                                wqn1Var2 = wqn1Var;
                                Iterable iterable2 = (Iterable) objJ2;
                                arrayList = new ArrayList(q7h.U(iterable2, 10));
                                it = iterable2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ev) it.next()).a);
                                }
                                setP1 = o7h.p1(arrayList);
                                cue0 cue0Var2 = oxVar2.c;
                                this.c = null;
                                this.f = oxVar2;
                                this.h = wqn1Var2;
                                this.i = ufg0Var2;
                                this.e = setP1;
                                this.d = i2;
                                this.b = (byte) 3;
                                objY = fn31.Y(cue0Var2.b, new iyb0(cue0Var2, (lnm) null, (byte) 7), this);
                                if (objY == d9nVar) {
                                    return d9nVar;
                                }
                                linkedHashSetY0 = dm61.y0(setP1, (Iterable) objY);
                                ArrayList arrayList5 = ((hhg0) wqn1Var2).i;
                                arrayList2 = new ArrayList();
                                while (r9.hasNext()) {
                                    if (!linkedHashSetY0.contains(((u7g0) obj3).b)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    of8 of8Var2 = ufg0Var2.b;
                                    this.c = null;
                                    this.f = oxVar2;
                                    this.h = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i2;
                                    this.b = (byte) 4;
                                    bma1 bma1Var3 = ox.h;
                                    oxVar2.getClass();
                                    oxVar3 = oxVar2;
                                    objS = smo1.s(new bh(arrayList2, oxVar3, of8Var2, (lnm) null, (byte) 2), this);
                                    if (objS == d9nVar) {
                                        return d9nVar;
                                    }
                                    oxVar4 = oxVar3;
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        u7g0Var = (u7g0) mmr0Var.a;
                                        di8Var = (di8) mmr0Var.b;
                                        if (di8Var != null) {
                                            u4i1Var = new u4i1(di8Var, di8Var.a, u7g0Var.c, u7g0Var.d, u7g0Var.e);
                                        } else {
                                            u4i1Var = null;
                                        }
                                        if (u4i1Var != null) {
                                            arrayList3.add(u4i1Var);
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        singleH = ((oq) oxVar4.a.get()).h(arrayList3);
                                        this.c = null;
                                        this.f = oxVar4;
                                        this.h = null;
                                        this.i = null;
                                        this.e = null;
                                        this.d = i2;
                                        this.b = (byte) 5;
                                        if (fc11.j(singleH, this) == d9nVar) {
                                            return d9nVar;
                                        }
                                        oxVar5 = oxVar4;
                                        this.c = null;
                                        this.f = null;
                                        this.h = null;
                                        this.i = null;
                                        this.e = null;
                                        this.d = i2;
                                        this.b = (byte) 6;
                                        bma1 bma1Var4 = ox.h;
                                        objY2 = fn31.Y(oxVar5.g, new lx(oxVar5, null, (byte) 1), this);
                                        if (objY2 == d9nVar) {
                                            objY2 = m231Var;
                                        }
                                        if (objY2 == d9nVar) {
                                            return d9nVar;
                                        }
                                    }
                                }
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        case 2:
                            i2 = this.d;
                            ufg0Var2 = (ufg0) this.i;
                            wqn1Var2 = (wqn1) this.h;
                            oxVar2 = (ox) this.f;
                            hm5.M(obj);
                            objJ2 = obj;
                            Iterable iterable3 = (Iterable) objJ2;
                            arrayList = new ArrayList(q7h.U(iterable3, 10));
                            it = iterable3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ev) it.next()).a);
                            }
                            setP1 = o7h.p1(arrayList);
                            cue0 cue0Var3 = oxVar2.c;
                            this.c = null;
                            this.f = oxVar2;
                            this.h = wqn1Var2;
                            this.i = ufg0Var2;
                            this.e = setP1;
                            this.d = i2;
                            this.b = (byte) 3;
                            objY = fn31.Y(cue0Var3.b, new iyb0(cue0Var3, (lnm) null, (byte) 7), this);
                            if (objY == d9nVar) {
                                return d9nVar;
                            }
                            linkedHashSetY0 = dm61.y0(setP1, (Iterable) objY);
                            ArrayList arrayList6 = ((hhg0) wqn1Var2).i;
                            arrayList2 = new ArrayList();
                            while (r9.hasNext()) {
                                if (!linkedHashSetY0.contains(((u7g0) obj3).b)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                of8 of8Var3 = ufg0Var2.b;
                                this.c = null;
                                this.f = oxVar2;
                                this.h = null;
                                this.i = null;
                                this.e = null;
                                this.d = i2;
                                this.b = (byte) 4;
                                bma1 bma1Var5 = ox.h;
                                oxVar2.getClass();
                                oxVar3 = oxVar2;
                                objS = smo1.s(new bh(arrayList2, oxVar3, of8Var3, (lnm) null, (byte) 2), this);
                                if (objS == d9nVar) {
                                    return d9nVar;
                                }
                                oxVar4 = oxVar3;
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    u7g0Var = (u7g0) mmr0Var.a;
                                    di8Var = (di8) mmr0Var.b;
                                    if (di8Var != null) {
                                        u4i1Var = new u4i1(di8Var, di8Var.a, u7g0Var.c, u7g0Var.d, u7g0Var.e);
                                    } else {
                                        u4i1Var = null;
                                    }
                                    if (u4i1Var != null) {
                                        arrayList3.add(u4i1Var);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    singleH = ((oq) oxVar4.a.get()).h(arrayList3);
                                    this.c = null;
                                    this.f = oxVar4;
                                    this.h = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i2;
                                    this.b = (byte) 5;
                                    if (fc11.j(singleH, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                    oxVar5 = oxVar4;
                                    this.c = null;
                                    this.f = null;
                                    this.h = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i2;
                                    this.b = (byte) 6;
                                    bma1 bma1Var6 = ox.h;
                                    objY2 = fn31.Y(oxVar5.g, new lx(oxVar5, null, (byte) 1), this);
                                    if (objY2 == d9nVar) {
                                        objY2 = m231Var;
                                    }
                                    if (objY2 == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        case 3:
                            i2 = this.d;
                            Set set = (Set) this.e;
                            ufg0Var2 = (ufg0) this.i;
                            wqn1Var2 = (wqn1) this.h;
                            oxVar2 = (ox) this.f;
                            hm5.M(obj);
                            setP1 = set;
                            objY = obj;
                            linkedHashSetY0 = dm61.y0(setP1, (Iterable) objY);
                            ArrayList arrayList7 = ((hhg0) wqn1Var2).i;
                            arrayList2 = new ArrayList();
                            while (r9.hasNext()) {
                                if (!linkedHashSetY0.contains(((u7g0) obj3).b)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                of8 of8Var4 = ufg0Var2.b;
                                this.c = null;
                                this.f = oxVar2;
                                this.h = null;
                                this.i = null;
                                this.e = null;
                                this.d = i2;
                                this.b = (byte) 4;
                                bma1 bma1Var7 = ox.h;
                                oxVar2.getClass();
                                oxVar3 = oxVar2;
                                objS = smo1.s(new bh(arrayList2, oxVar3, of8Var4, (lnm) null, (byte) 2), this);
                                if (objS == d9nVar) {
                                    return d9nVar;
                                }
                                oxVar4 = oxVar3;
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    u7g0Var = (u7g0) mmr0Var.a;
                                    di8Var = (di8) mmr0Var.b;
                                    if (di8Var != null) {
                                        u4i1Var = new u4i1(di8Var, di8Var.a, u7g0Var.c, u7g0Var.d, u7g0Var.e);
                                    } else {
                                        u4i1Var = null;
                                    }
                                    if (u4i1Var != null) {
                                        arrayList3.add(u4i1Var);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    singleH = ((oq) oxVar4.a.get()).h(arrayList3);
                                    this.c = null;
                                    this.f = oxVar4;
                                    this.h = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i2;
                                    this.b = (byte) 5;
                                    if (fc11.j(singleH, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                    oxVar5 = oxVar4;
                                    this.c = null;
                                    this.f = null;
                                    this.h = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i2;
                                    this.b = (byte) 6;
                                    bma1 bma1Var8 = ox.h;
                                    objY2 = fn31.Y(oxVar5.g, new lx(oxVar5, null, (byte) 1), this);
                                    if (objY2 == d9nVar) {
                                        objY2 = m231Var;
                                    }
                                    if (objY2 == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        case 4:
                            i2 = this.d;
                            ox oxVar8 = (ox) this.f;
                            hm5.M(obj);
                            oxVar4 = oxVar8;
                            objS = obj;
                            arrayList3 = new ArrayList();
                            while (r2.hasNext()) {
                                u7g0Var = (u7g0) mmr0Var.a;
                                di8Var = (di8) mmr0Var.b;
                                if (di8Var != null) {
                                    u4i1Var = new u4i1(di8Var, di8Var.a, u7g0Var.c, u7g0Var.d, u7g0Var.e);
                                } else {
                                    u4i1Var = null;
                                }
                                if (u4i1Var != null) {
                                    arrayList3.add(u4i1Var);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                singleH = ((oq) oxVar4.a.get()).h(arrayList3);
                                this.c = null;
                                this.f = oxVar4;
                                this.h = null;
                                this.i = null;
                                this.e = null;
                                this.d = i2;
                                this.b = (byte) 5;
                                if (fc11.j(singleH, this) == d9nVar) {
                                    return d9nVar;
                                }
                                oxVar5 = oxVar4;
                                this.c = null;
                                this.f = null;
                                this.h = null;
                                this.i = null;
                                this.e = null;
                                this.d = i2;
                                this.b = (byte) 6;
                                bma1 bma1Var9 = ox.h;
                                objY2 = fn31.Y(oxVar5.g, new lx(oxVar5, null, (byte) 1), this);
                                if (objY2 == d9nVar) {
                                    objY2 = m231Var;
                                }
                                if (objY2 == d9nVar) {
                                    return d9nVar;
                                }
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        case 5:
                            i2 = this.d;
                            oxVar5 = (ox) this.f;
                            hm5.M(obj);
                            this.c = null;
                            this.f = null;
                            this.h = null;
                            this.i = null;
                            this.e = null;
                            this.d = i2;
                            this.b = (byte) 6;
                            bma1 bma1Var10 = ox.h;
                            objY2 = fn31.Y(oxVar5.g, new lx(oxVar5, null, (byte) 1), this);
                            if (objY2 == d9nVar) {
                                objY2 = m231Var;
                            }
                            if (objY2 == d9nVar) {
                                return d9nVar;
                            }
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        case 6:
                            hm5.M(obj);
                            thA = e331.a(m231Var);
                            if (thA != null) {
                                Logger.e(thA, "Error storing managed accounts", new Object[0]);
                            }
                            return new e331(m231Var);
                        default:
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                break;
            case 1:
                Set set2 = (Set) this.e;
                vr20 vr20Var7 = (vr20) this.c;
                byte b2 = this.b;
                try {
                    if (b2 == 0) {
                        hm5.M(obj);
                        try {
                            dg8 dg8Var = (dg8) this.h;
                            q59 q59Var = (q59) this.i;
                            int i13 = this.d;
                            this.c = null;
                            this.f = vr20Var7;
                            this.g = vr20Var7;
                            this.b = (byte) 1;
                            objC = d3p1.C(dg8Var, q59Var, i13, this);
                            if (objC != d9nVar) {
                                vr20Var = vr20Var7;
                                list = (List) objC;
                                if (list.isEmpty()) {
                                    Set set3 = set2;
                                    iS2 = zno1.s(q7h.U(set3, 10));
                                    if (iS2 < 16) {
                                        iS2 = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iS2);
                                    for (Object obj4 : set3) {
                                        linkedHashMap.put(obj4, new h3r(new d3r("No playlists available")));
                                    }
                                } else {
                                    Set set4 = set2;
                                    iS = zno1.s(q7h.U(set4, 10));
                                    if (iS < 16) {
                                        iS = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(iS);
                                    for (Object obj5 : set4) {
                                        linkedHashMap2.put(obj5, new j3r(new bo9(list)));
                                    }
                                    linkedHashMap = linkedHashMap2;
                                }
                                this.c = null;
                                this.f = null;
                                this.g = null;
                                this.b = (byte) 2;
                                if (vr20Var7.emit(linkedHashMap, this) != d9nVar) {
                                    return m231Var;
                                }
                            }
                        } catch (Exception unused) {
                            Set set5 = set2;
                            int iS3 = zno1.s(q7h.U(set5, 10));
                            linkedHashMap = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                            for (Object obj6 : set5) {
                                linkedHashMap.put(obj6, new h3r(new d3r("Error loading library playlists")));
                            }
                            this.c = null;
                            this.f = null;
                            this.g = null;
                            this.b = (byte) 2;
                            if (vr20Var7.emit(linkedHashMap, this) != d9nVar) {
                                return m231Var;
                            }
                            return d9nVar;
                        }
                    } else {
                        if (b2 != 1) {
                            if (b2 == 2) {
                                hm5.M(obj);
                                return m231Var;
                            }
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vr20Var7 = (vr20) this.g;
                        vr20 vr20Var8 = (vr20) this.f;
                        try {
                            hm5.M(obj);
                            vr20Var = vr20Var8;
                            objC = obj;
                            try {
                                list = (List) objC;
                                if (list.isEmpty()) {
                                    Set set6 = set2;
                                    iS2 = zno1.s(q7h.U(set6, 10));
                                    if (iS2 < 16) {
                                        iS2 = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iS2);
                                    while (r3.hasNext()) {
                                        linkedHashMap.put(obj4, new h3r(new d3r("No playlists available")));
                                    }
                                } else {
                                    Set set7 = set2;
                                    iS = zno1.s(q7h.U(set7, 10));
                                    if (iS < 16) {
                                        iS = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(iS);
                                    while (r7.hasNext()) {
                                        linkedHashMap2.put(obj5, new j3r(new bo9(list)));
                                    }
                                    linkedHashMap = linkedHashMap2;
                                }
                            } catch (Exception unused2) {
                                vr20Var7 = vr20Var;
                                Set set8 = set2;
                                int iS4 = zno1.s(q7h.U(set8, 10));
                                linkedHashMap = new LinkedHashMap(iS4 >= 16 ? iS4 : 16);
                                while (r0.hasNext()) {
                                    linkedHashMap.put(obj6, new h3r(new d3r("Error loading library playlists")));
                                }
                            }
                        } catch (Exception unused3) {
                            vr20Var7 = vr20Var8;
                            Set set9 = set2;
                            int iS5 = zno1.s(q7h.U(set9, 10));
                            linkedHashMap = new LinkedHashMap(iS5 >= 16 ? iS5 : 16);
                            while (r0.hasNext()) {
                                linkedHashMap.put(obj6, new h3r(new d3r("Error loading library playlists")));
                            }
                            this.c = null;
                            this.f = null;
                            this.g = null;
                            this.b = (byte) 2;
                            if (vr20Var7.emit(linkedHashMap, this) != d9nVar) {
                                return m231Var;
                            }
                            return d9nVar;
                        }
                        this.c = null;
                        this.f = null;
                        this.g = null;
                        this.b = (byte) 2;
                        if (vr20Var7.emit(linkedHashMap, this) != d9nVar) {
                            return m231Var;
                        }
                    }
                    return d9nVar;
                } catch (CancellationException e) {
                    throw e;
                }
            case 2:
                c9n c9nVar = (c9n) this.c;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        int i14 = this.d;
                        l2t l2tVar = (s2t) this.f;
                        hm5.M(obj);
                        l2tVarQ = l2tVar;
                        obj2 = null;
                        iG = i14;
                        objQ = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uri = (Uri) this.g;
                        hm5.M(obj);
                        objE = obj;
                    }
                    return new ay9(uri, (Uri) objE);
                }
                hm5.M(obj);
                iG = z4p1.G(((u7h) this.h).a);
                obj2 = null;
                l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new cy9((q59) this.i, iG, (lnm) null, (byte) 1), 3);
                s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new cy9((by9) this.e, iG, (lnm) null, (byte) 0), 3);
                this.c = null;
                this.f = l2tVarQ;
                this.d = iG;
                this.b = (byte) 1;
                objQ = s2tVarQ.Q(this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                uri = (Uri) objQ;
                this.c = obj2;
                this.f = obj2;
                this.g = uri;
                this.d = iG;
                this.b = (byte) 2;
                objE = l2tVarQ.E(this);
                if (objE == d9nVar) {
                    return d9nVar;
                }
                return new ay9(uri, (Uri) objE);
            case 3:
                String str = (String) this.c;
                byte b4 = this.b;
                try {
                    if (b4 == 0) {
                        hm5.M(obj);
                        pcdVar = (pcd) this.i;
                        vgn0Var = pcdVar.f;
                        zu90Var = (zu90) this.e;
                        this.c = str;
                        this.f = vgn0Var;
                        this.g = pcdVar;
                        this.h = zu90Var;
                        this.d = 0;
                        this.b = (byte) 1;
                        if (vgn0Var.a(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (b4 != 1) {
                            if (b4 != 2) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vgn0Var2 = (vgn0) this.f;
                            try {
                                hm5.M(obj);
                                objD = obj;
                                jcd jcdVar = (jcd) objD;
                                vgn0Var2.c((Object) null);
                                return jcdVar;
                            } catch (Throwable th2) {
                                th = th2;
                                vgn0Var2.c((Object) null);
                                throw th;
                            }
                        }
                        i6 = this.d;
                        zu90 zu90Var2 = (zu90) this.h;
                        pcdVar = (pcd) this.g;
                        vgn0 vgn0Var3 = (vgn0) this.f;
                        hm5.M(obj);
                        zu90Var = zu90Var2;
                        vgn0Var = vgn0Var3;
                    }
                    this.c = null;
                    this.f = vgn0Var;
                    this.g = null;
                    this.h = null;
                    this.d = i6;
                    this.b = (byte) 2;
                    objD = pcdVar.d(zu90Var, str, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    vgn0Var2 = vgn0Var;
                    jcd jcdVar2 = (jcd) objD;
                    vgn0Var2.c((Object) null);
                    return jcdVar2;
                } catch (Throwable th3) {
                    th = th3;
                    vgn0Var2 = vgn0Var;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            case 4:
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    vr20Var2 = (vr20) this.c;
                    yxeVar = (yxe) this.f;
                    gxz0Var = yxeVar.c;
                    tz01 tz01Var = ((o0f) this.g).i;
                    String str2 = yxeVar.b;
                    String str3 = gxz0Var.b;
                    boolean z2 = yxeVar.d;
                    this.c = null;
                    this.h = yxeVar;
                    this.i = vr20Var2;
                    this.e = gxz0Var;
                    this.d = 0;
                    this.b = (byte) 1;
                    objI = tz01Var.i(str2, str3, this, z2);
                    if (objI != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b5 != 1) {
                    if (b5 != 2 && b5 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return m231Var;
                }
                i9 = this.d;
                gxz0Var = (gxz0) this.e;
                vr20Var2 = (vr20) this.i;
                yxeVar = (yxe) this.h;
                hm5.M(obj);
                objI = ((e331) obj).a;
                if (e331.a(objI) == null) {
                    e3f e3fVar = new e3f(yxeVar.b, gxz0Var.a, (gxz0) objI);
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.d = i9;
                    this.b = (byte) 2;
                    if (vr20Var2.emit(e3fVar, this) != d9nVar) {
                        return m231Var;
                    }
                } else {
                    d3f d3fVar = new d3f(yxeVar.b, gxz0Var);
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.d = i9;
                    this.b = (byte) 3;
                    if (vr20Var2.emit(d3fVar, this) != d9nVar) {
                        return m231Var;
                    }
                }
                return d9nVar;
            case 5:
                rm5 rm5Var = (rm5) this.g;
                byte b6 = this.b;
                if (b6 != 0) {
                    try {
                        if (b6 == 1) {
                            int i15 = this.d;
                            vr20 vr20Var9 = (vr20) this.e;
                            x6k x6kVar3 = (x6k) this.i;
                            hm5.M(obj);
                            i3 = i15;
                            vr20Var4 = vr20Var9;
                            x6kVar = x6kVar3;
                            objM = obj;
                            try {
                                campaignActionResponse = (CampaignActionResponse) objM;
                                if (campaignActionResponse.getMessage().length() > 0) {
                                    n8kVar = new n8k(campaignActionResponse.getMessage());
                                    this.c = null;
                                    this.i = x6kVar;
                                    this.e = vr20Var4;
                                    this.d = i3;
                                    this.b = (byte) 2;
                                    if (vr20Var4.emit(n8kVar, this) == d9nVar) {
                                        int i16 = i3;
                                        vr20Var5 = vr20Var4;
                                        i4 = i16;
                                        x6kVar2 = x6kVar;
                                        vr20 vr20Var10 = vr20Var5;
                                        i3 = i4;
                                        vr20Var4 = vr20Var10;
                                        String str4 = x6kVar2.a;
                                        String str5 = x6kVar2.b;
                                        String str6 = x6kVar2.c;
                                        this.c = null;
                                        this.i = x6kVar2;
                                        this.e = vr20Var4;
                                        this.d = i3;
                                        this.b = (byte) 3;
                                        objX = rm5Var.x(str4, str5, str6, this);
                                        if (objX == d9nVar) {
                                        }
                                    }
                                } else {
                                    x6kVar2 = x6kVar;
                                    String str7 = x6kVar2.a;
                                    String str8 = x6kVar2.b;
                                    String str9 = x6kVar2.c;
                                    this.c = null;
                                    this.i = x6kVar2;
                                    this.e = vr20Var4;
                                    this.d = i3;
                                    this.b = (byte) 3;
                                    objX = rm5Var.x(str7, str8, str9, this);
                                    if (objX == d9nVar) {
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                vr20Var3 = vr20Var4;
                                i8 = i3;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "Failed to mark can't attend";
                                }
                                o8kVar = new o8k(message);
                                this.c = null;
                                this.i = null;
                                this.e = null;
                                this.d = i8;
                                this.b = (byte) 5;
                                if (vr20Var3.emit(o8kVar, this) != d9nVar) {
                                    return m231Var;
                                }
                            }
                        } else if (b6 != 2) {
                            if (b6 == 3) {
                                int i17 = this.d;
                                vr20 vr20Var11 = (vr20) this.e;
                                x6k x6kVar4 = (x6k) this.i;
                                try {
                                    hm5.M(obj);
                                    x6kVar2 = x6kVar4;
                                    i3 = i17;
                                    vr20Var4 = vr20Var11;
                                    objX = obj;
                                } catch (Exception e3) {
                                    e = e3;
                                    i8 = i17;
                                    vr20Var3 = vr20Var11;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "Failed to mark can't attend";
                                    }
                                    o8kVar = new o8k(message);
                                    this.c = null;
                                    this.i = null;
                                    this.e = null;
                                    this.d = i8;
                                    this.b = (byte) 5;
                                    if (vr20Var3.emit(o8kVar, this) != d9nVar) {
                                        return m231Var;
                                    }
                                }
                            } else {
                                if (b6 != 4) {
                                    if (b6 != 5) {
                                        eg.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    hm5.M(obj);
                                    return m231Var;
                                }
                                i8 = this.d;
                                vr20Var3 = (vr20) this.e;
                                try {
                                    hm5.M(obj);
                                    return m231Var;
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            }
                            message = e.getMessage();
                            if (message == null) {
                                message = "Failed to mark can't attend";
                            }
                            o8kVar = new o8k(message);
                            this.c = null;
                            this.i = null;
                            this.e = null;
                            this.d = i8;
                            this.b = (byte) 5;
                            if (vr20Var3.emit(o8kVar, this) != d9nVar) {
                                return m231Var;
                            }
                        } else {
                            i4 = this.d;
                            vr20Var5 = (vr20) this.e;
                            x6kVar2 = (x6k) this.i;
                            hm5.M(obj);
                            vr20 vr20Var12 = vr20Var5;
                            i3 = i4;
                            vr20Var4 = vr20Var12;
                            String str10 = x6kVar2.a;
                            String str11 = x6kVar2.b;
                            String str12 = x6kVar2.c;
                            this.c = null;
                            this.i = x6kVar2;
                            this.e = vr20Var4;
                            this.d = i3;
                            this.b = (byte) 3;
                            objX = rm5Var.x(str10, str11, str12, this);
                            if (objX == d9nVar) {
                            }
                        }
                        CampaignCard campaignCard = (CampaignCard) objX;
                        xrkVar = (xrk) this.h;
                        if (xrkVar.p && xrkVar.q) {
                            z = true;
                        }
                        j8kVar = new j8k(x6kVar2.a, x6kVar2.b, x6kVar2.c, grn1.A(campaignCard, z));
                        this.c = null;
                        this.i = null;
                        this.e = vr20Var4;
                        this.d = i3;
                        this.b = (byte) 4;
                        if (vr20Var4.emit(j8kVar, this) != d9nVar) {
                            return m231Var;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i8 = b6;
                        vr20Var3 = "call to 'resume' before 'invoke' with coroutine";
                    }
                } else {
                    hm5.M(obj);
                    vr20Var4 = (vr20) this.c;
                    x6k x6kVar5 = (x6k) this.f;
                    try {
                        String str13 = x6kVar5.a;
                        this.c = null;
                        this.i = x6kVar5;
                        this.e = vr20Var4;
                        this.d = 0;
                        this.b = (byte) 1;
                        objM = rm5Var.m(str13, this);
                        if (objM != d9nVar) {
                            x6kVar = x6kVar5;
                            i3 = 0;
                            campaignActionResponse = (CampaignActionResponse) objM;
                            if (campaignActionResponse.getMessage().length() > 0) {
                                n8kVar = new n8k(campaignActionResponse.getMessage());
                                this.c = null;
                                this.i = x6kVar;
                                this.e = vr20Var4;
                                this.d = i3;
                                this.b = (byte) 2;
                                if (vr20Var4.emit(n8kVar, this) == d9nVar) {
                                    int i18 = i3;
                                    vr20Var5 = vr20Var4;
                                    i4 = i18;
                                    x6kVar2 = x6kVar;
                                    vr20 vr20Var13 = vr20Var5;
                                    i3 = i4;
                                    vr20Var4 = vr20Var13;
                                    String str14 = x6kVar2.a;
                                    String str15 = x6kVar2.b;
                                    String str16 = x6kVar2.c;
                                    this.c = null;
                                    this.i = x6kVar2;
                                    this.e = vr20Var4;
                                    this.d = i3;
                                    this.b = (byte) 3;
                                    objX = rm5Var.x(str14, str15, str16, this);
                                    if (objX == d9nVar) {
                                        CampaignCard campaignCard2 = (CampaignCard) objX;
                                        xrkVar = (xrk) this.h;
                                        if (xrkVar.p) {
                                            z = true;
                                        }
                                        j8kVar = new j8k(x6kVar2.a, x6kVar2.b, x6kVar2.c, grn1.A(campaignCard2, z));
                                        this.c = null;
                                        this.i = null;
                                        this.e = vr20Var4;
                                        this.d = i3;
                                        this.b = (byte) 4;
                                        if (vr20Var4.emit(j8kVar, this) != d9nVar) {
                                            return m231Var;
                                        }
                                    }
                                }
                            } else {
                                x6kVar2 = x6kVar;
                                String str17 = x6kVar2.a;
                                String str18 = x6kVar2.b;
                                String str19 = x6kVar2.c;
                                this.c = null;
                                this.i = x6kVar2;
                                this.e = vr20Var4;
                                this.d = i3;
                                this.b = (byte) 3;
                                objX = rm5Var.x(str17, str18, str19, this);
                                if (objX == d9nVar) {
                                    CampaignCard campaignCard3 = (CampaignCard) objX;
                                    xrkVar = (xrk) this.h;
                                    if (xrkVar.p) {
                                        z = true;
                                    }
                                    j8kVar = new j8k(x6kVar2.a, x6kVar2.b, x6kVar2.c, grn1.A(campaignCard3, z));
                                    this.c = null;
                                    this.i = null;
                                    this.e = vr20Var4;
                                    this.d = i3;
                                    this.b = (byte) 4;
                                    if (vr20Var4.emit(j8kVar, this) != d9nVar) {
                                        return m231Var;
                                    }
                                }
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        vr20Var3 = vr20Var4;
                        message = e.getMessage();
                        if (message == null) {
                            message = "Failed to mark can't attend";
                        }
                        o8kVar = new o8k(message);
                        this.c = null;
                        this.i = null;
                        this.e = null;
                        this.d = i8;
                        this.b = (byte) 5;
                        if (vr20Var3.emit(o8kVar, this) != d9nVar) {
                            return m231Var;
                        }
                    }
                }
                return d9nVar;
            case 6:
                return e(obj);
            case 7:
                return g(obj);
            case 8:
                return h(obj);
            case 9:
                return i(obj);
            case 10:
                return j(obj);
            case 11:
                return m(obj);
            case 12:
                return o(obj);
            case 13:
                return p(obj);
            default:
                byte b7 = this.b;
                if (b7 == 0) {
                    hm5.M(obj);
                    vr20Var6 = (vr20) this.c;
                    bwi1Var = (bwi1) this.f;
                    kyi1 kyi1Var = bwi1Var.c.c;
                    kfd1 kfd1Var = (kfd1) o7h.t0(kyi1Var.b, kyi1Var.a);
                    if (kfd1Var != null) {
                        Iterator it2 = kfd1Var.b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                ArrayList arrayList8 = ((vf51) next).a;
                                if (!arrayList8.isEmpty()) {
                                    Iterator it3 = arrayList8.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            continue;
                                        } else if (((f6m) it3.next()).b instanceof oyi1) {
                                        }
                                    }
                                }
                            } else {
                                next = null;
                            }
                        }
                        vf51Var = (vf51) next;
                    } else {
                        vf51Var = null;
                    }
                    String str20 = vf51Var != null ? vf51Var.b : null;
                    if (str20 == null || str20.length() == 0) {
                        return m231Var;
                    }
                    utw0 utw0Var = (utw0) this.g;
                    String str21 = bwi1Var.c.a.a;
                    this.c = null;
                    this.i = bwi1Var;
                    this.e = vr20Var6;
                    this.d = 0;
                    this.b = (byte) 1;
                    wl40 wl40VarN = GetConcertsAtVenueNextPageRequest.n();
                    wl40VarN.q(str21);
                    wl40VarN.n(str20);
                    GetConcertsAtVenueNextPageRequest getConcertsAtVenueNextPageRequestBuild = wl40VarN.build();
                    tyi1 tyi1Var = (tyi1) utw0Var.a;
                    getConcertsAtVenueNextPageRequestBuild.getClass();
                    objA = tyi1Var.a(getConcertsAtVenueNextPageRequestBuild, this);
                    if (objA != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b7 != 1) {
                    if (b7 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return m231Var;
                }
                i7 = this.d;
                vr20Var6 = (vr20) this.e;
                bwi1Var = (bwi1) this.i;
                hm5.M(obj);
                objA = obj;
                GetConcertsAtVenueNextPageResponse getConcertsAtVenueNextPageResponse3 = (GetConcertsAtVenueNextPageResponse) objA;
                f2g1 f2g1Var = (f2g1) this.h;
                ywi1 ywi1Var = bwi1Var.c;
                kyi1 kyi1Var2 = ywi1Var.c;
                h290<ContentRow> h290VarO = getConcertsAtVenueNextPageResponse3.o();
                ArrayList arrayList9 = new ArrayList(q7h.U(h290VarO, 10));
                for (ContentRow contentRow : h290VarO) {
                    contentRow.getClass();
                    arrayList9.add(f2g1Var.f(contentRow));
                }
                List<kfd1> list2 = kyi1Var2.a;
                ArrayList arrayList10 = new ArrayList(q7h.U(list2, 10));
                for (kfd1 kfd1Var2 : list2) {
                    if (kfd1Var2.a.equals("events")) {
                        List<vf51> list3 = kfd1Var2.b;
                        ArrayList arrayList11 = new ArrayList(q7h.U(list3, i5));
                        for (vf51 vf51Var2 : list3) {
                            ArrayList arrayList12 = vf51Var2.a;
                            if (arrayList12.isEmpty()) {
                                getConcertsAtVenueNextPageResponse2 = getConcertsAtVenueNextPageResponse3;
                            }
                            Iterator it4 = arrayList12.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    getConcertsAtVenueNextPageResponse2 = getConcertsAtVenueNextPageResponse3;
                                }
                                getConcertsAtVenueNextPageResponse2 = getConcertsAtVenueNextPageResponse3;
                                if (((f6m) it4.next()).b instanceof oyi1) {
                                    vf51Var2 = new vf51(o7h.N0(arrayList9, vf51Var2.a), getConcertsAtVenueNextPageResponse2.p() ? getConcertsAtVenueNextPageResponse2.n() : null);
                                }
                                getConcertsAtVenueNextPageResponse3 = getConcertsAtVenueNextPageResponse2;
                                break;
                                break;
                            }
                            break;
                            arrayList11.add(vf51Var2);
                            getConcertsAtVenueNextPageResponse3 = getConcertsAtVenueNextPageResponse2;
                        }
                        getConcertsAtVenueNextPageResponse = getConcertsAtVenueNextPageResponse3;
                        kfd1Var2 = new kfd1(kfd1Var2.a, arrayList11);
                    } else {
                        getConcertsAtVenueNextPageResponse = getConcertsAtVenueNextPageResponse3;
                    }
                    arrayList10.add(kfd1Var2);
                    getConcertsAtVenueNextPageResponse3 = getConcertsAtVenueNextPageResponse;
                    i5 = 10;
                }
                uwi1 uwi1Var = new uwi1(ywi1.a(ywi1Var, new kyi1(arrayList10, kyi1Var2.b), null, 11));
                this.c = null;
                this.i = null;
                this.e = null;
                this.d = i7;
                this.b = (byte) 2;
                if (vr20Var6.emit(uwi1Var, this) != d9nVar) {
                    return m231Var;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx(Object obj, lnm lnmVar, Object obj2, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx(Object obj, lnm lnmVar, Object obj2, Object obj3, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(Object obj, lnm lnmVar, bfd bfdVar, q8n q8nVar, lzn0 lzn0Var) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.f = obj;
        this.g = bfdVar;
        this.h = q8nVar;
        this.i = lzn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(ox oxVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.g = oxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(dg8 dg8Var, q59 q59Var, int i, Set set, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.h = dg8Var;
        this.i = q59Var;
        this.d = i;
        this.e = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(pcd pcdVar, zu90 zu90Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.i = pcdVar;
        this.e = zu90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(u7h u7hVar, q59 q59Var, by9 by9Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.h = u7hVar;
        this.i = q59Var;
        this.e = by9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(res resVar, int i, lhg1 lhg1Var, ven0 ven0Var, ven0 ven0Var2, frr0 frr0Var, frr0 frr0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.f = resVar;
        this.d = i;
        this.g = lhg1Var;
        this.h = ven0Var;
        this.i = ven0Var2;
        this.e = frr0Var;
        this.c = frr0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(xu30 xu30Var, Context context, qcf0 qcf0Var, String str, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.g = xu30Var;
        this.h = context;
        this.i = qcf0Var;
        this.e = str;
        this.c = ven0Var;
    }
}
