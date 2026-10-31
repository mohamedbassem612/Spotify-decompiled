package p;

import android.content.res.Resources;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class obj0 implements h0r0 {
    public final hvj a;
    public final xcj0 b;
    public final ldo c;
    public final los d;
    public final cex0 e;
    public final cbr0 f;

    public obj0(Resources resources, hvj hvjVar, xcj0 xcj0Var, ldo ldoVar, los losVar, cex0 cex0Var) {
        this.a = hvjVar;
        this.b = xcj0Var;
        this.c = ldoVar;
        this.d = losVar;
        this.e = cex0Var;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.G1("CHAT_ADD_FRIENDS", "chat/add-friends", 315, "chat"), nik1.e5, (nar0) null), new s9h1(14, true, false, false), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.6f)), (ixb) null, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4062)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new o6e0(new oxa0(this, null, (byte) 15), f46.I(new p6e0[0])), new j2i(-306020784, new mbj0(this, (byte) 0), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        nbj0 nbj0Var;
        Exception e;
        String str;
        w4i1 w4i1Var;
        if (onmVar instanceof nbj0) {
            nbj0Var = (nbj0) onmVar;
            int i = nbj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbj0Var.d = i - Integer.MIN_VALUE;
            } else {
                nbj0Var = new nbj0(this, onmVar);
            }
        } else {
            nbj0Var = new nbj0(this, onmVar);
        }
        Object obj = nbj0Var.b;
        int i2 = nbj0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String str2 = this.b.a;
                try {
                    cex0 cex0Var = this.e;
                    List listSingletonList = Collections.singletonList(str2);
                    nbj0Var.a = str2;
                    nbj0Var.d = 1;
                    Object objA = cex0Var.a(listSingletonList, nbj0Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    obj = objA;
                    str = str2;
                } catch (Exception e2) {
                    e = e2;
                    str = str2;
                    Logger.e(e, "MessagingInvites: Failed to load current user", new Object[0]);
                    w4i1Var = null;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = nbj0Var.a;
                try {
                    hm5.M(obj);
                } catch (Exception e3) {
                    e = e3;
                    Logger.e(e, "MessagingInvites: Failed to load current user", new Object[0]);
                    w4i1Var = null;
                }
            }
            w4i1Var = (w4i1) ((Map) obj).get(str);
            return w4i1Var == null ? new w4i1(str, "", 12, (String) null) : w4i1Var;
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
