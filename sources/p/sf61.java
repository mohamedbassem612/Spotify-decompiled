package p;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sf61 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    public sf61(Looper looper) {
        super(looper);
        this.c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.a) {
            c(messenger, too1.r().a().a);
            return;
        }
        sj20 sj20Var = (sj20) ((nd61) e4x0.v0()).c.get();
        String str = sj20Var != null ? sj20Var.a : null;
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        mf61 mf61VarR = too1.r();
        int i = mf61VarR.d + 1;
        mf61VarR.d = i;
        String lowerCase = i == 0 ? mf61VarR.c : nhc1.W(((UUID) mf61VarR.b.invoke()).toString(), "-", "").toLowerCase(Locale.ROOT);
        String str = mf61VarR.c;
        int i2 = mf61VarR.d;
        mf61VarR.a.getClass();
        mf61VarR.e = new qd61(i2, lowerCase, str, System.currentTimeMillis() * 1000);
        mf61VarR.a();
        too1.r().a();
        too1.r().a().toString();
        kf61 kf61Var = (kf61) i5x0.n();
        c921.y(smo1.e(kf61Var.e), (o8n) null, 0, new sh6(kf61Var, too1.r().a(), (lnm) null, (byte) 7), 3);
        Iterator it = new ArrayList(this.c).iterator();
        while (it.hasNext()) {
            a((Messenger) it.next());
        }
        nd61 nd61Var = (nd61) e4x0.v0();
        c921.y(smo1.e(nd61Var.b), (o8n) null, 0, new lc41(nd61Var, too1.r().a().a, (lnm) null, (byte) 25), 3);
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            this.c.remove(messenger);
        } catch (Exception unused2) {
            Objects.toString(messenger);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        cb61 cb61Var;
        jfv jfvVar;
        Integer num;
        long jK0;
        if (this.b > message.getWhen()) {
            message.getWhen();
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                message.getWhen();
                this.b = message.getWhen();
                return;
            }
            if (i != 4) {
                message.toString();
                super.handleMessage(message);
                return;
            }
            Messenger messenger = message.replyTo;
            ArrayList arrayList = this.c;
            arrayList.add(messenger);
            a(message.replyTo);
            Objects.toString(message.replyTo);
            message.getWhen();
            arrayList.size();
            return;
        }
        message.getWhen();
        if (this.a) {
            long when = message.getWhen() - this.b;
            lj61.c.getClass();
            lj61 lj61Var = (lj61) g2p1.G().b(lj61.class);
            jfv jfvVarJ = lj61Var.a.j();
            if (jfvVarJ != null) {
                jK0 = jfvVarJ.a;
                if (!jfv.o(jK0) || jfv.n(jK0)) {
                    cb61Var = lj61Var.b.b().b;
                    jfvVar = null;
                    if (cb61Var != null) {
                        u890.C("sessionConfigs");
                        throw null;
                    }
                    num = cb61Var.c;
                    if (num != null) {
                        ytw0 ytw0Var = jfv.b;
                        jfvVar = new jfv(fdg1.k0(num.intValue(), ngv.e));
                    }
                    if (jfvVar != null) {
                        jK0 = jfvVar.a;
                        if (jfv.o(jK0) || jfv.n(jK0)) {
                            ytw0 ytw0Var2 = jfv.b;
                            jK0 = fdg1.k0(30, ngv.f);
                        }
                    } else {
                        ytw0 ytw0Var3 = jfv.b;
                        jK0 = fdg1.k0(30, ngv.f);
                    }
                }
            } else {
                cb61Var = lj61Var.b.b().b;
                jfvVar = null;
                if (cb61Var != null) {
                    u890.C("sessionConfigs");
                    throw null;
                }
                num = cb61Var.c;
                if (num != null) {
                    ytw0 ytw0Var4 = jfv.b;
                    jfvVar = new jfv(fdg1.k0(num.intValue(), ngv.e));
                }
                if (jfvVar != null) {
                    jK0 = jfvVar.a;
                    if (jfv.o(jK0)) {
                        ytw0 ytw0Var5 = jfv.b;
                        jK0 = fdg1.k0(30, ngv.f);
                    } else {
                        ytw0 ytw0Var6 = jfv.b;
                        jK0 = fdg1.k0(30, ngv.f);
                    }
                } else {
                    ytw0 ytw0Var7 = jfv.b;
                    jK0 = fdg1.k0(30, ngv.f);
                }
            }
            if (when > jfv.h(jK0)) {
                b();
            }
        } else {
            this.a = true;
            b();
        }
        this.b = message.getWhen();
    }
}
