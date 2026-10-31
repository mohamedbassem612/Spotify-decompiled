package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.messages.EventSenderStats2NonAuth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cd00 implements zga {
    public static final byte[] n = phc.i("EventSenderStats2NonAuth").t();
    public static final int o = 82800000;
    public final ud00 a;
    public final trz0 b;
    public final qav c;
    public final s561 d;
    public final ac00 e;
    public final mb00 f;
    public final uny g;
    public final zq4 h;
    public final kc00 i;
    public final g7t j;
    public final long k = TimeUnit.SECONDS.toMillis(300);
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicLong m = new AtomicLong(0);

    public cd00(ud00 ud00Var, trz0 trz0Var, rav ravVar, sua suaVar, s561 s561Var, t561 t561Var, s900 s900Var, ac00 ac00Var, mb00 mb00Var, uny unyVar, zq4 zq4Var, kc00 kc00Var) {
        this.a = ud00Var;
        this.b = trz0Var;
        this.c = ravVar;
        this.d = s561Var;
        this.e = ac00Var;
        this.f = mb00Var;
        this.g = unyVar;
        this.h = zq4Var;
        this.i = kc00Var;
        this.j = new g7t(s900Var, t561Var, ac00Var, (byte) 1);
    }

    @Override // p.zga
    public final void a(Collection collection) {
        Object next;
        if (collection.isEmpty()) {
            return;
        }
        this.e.getClass();
        this.l.set(ac00.b());
        n700 n700Var = (n700) o7h.p0(collection);
        uny unyVar = this.g;
        if (u890.j(n700Var.b, "EventSenderStats2NonAuth")) {
            Iterator it = n700Var.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((mmr0) next).a, "message"));
            mmr0 mmr0Var = (mmr0) next;
            if (mmr0Var != null) {
                try {
                    EventSenderStats2NonAuth eventSenderStats2NonAuthB0 = EventSenderStats2NonAuth.b0((phc) mmr0Var.b);
                    adn0 adn0Var = (adn0) ((den0) this.i.b).get();
                    if (adn0Var.b && eventSenderStats2NonAuthB0.E() <= 0) {
                        return;
                    }
                    eventSenderStats2NonAuthB0.getClass();
                    dd00 dd00VarU = sua.u(eventSenderStats2NonAuthB0);
                    List listA = dd00VarU.a();
                    Map mapB = dd00VarU.b();
                    List listC = dd00VarU.c();
                    if (!adn0Var.b) {
                        if (unyVar.u(listA, listC, mapB)) {
                            this.m.set(ac00.b());
                        }
                        unyVar.J(listA, listC, mapB);
                    }
                    ((rav) this.c).i(listC);
                } catch (InvalidProtocolBufferException e) {
                    e.getMessage();
                    this.h.a();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    @Override // p.zga
    public final n561 b(String str) {
        boolean z;
        List listK0;
        byte[] bArr;
        den0 den0Var = (den0) this.i.b;
        AtomicLong atomicLong = this.l;
        long j = atomicLong.get();
        v7x v7xVar = v7x.a;
        ac00 ac00Var = this.e;
        if (j > 0) {
            ac00Var.getClass();
            if (ac00.b() - atomicLong.get() < this.k) {
                return v7xVar;
            }
        }
        ArrayList arrayList = new ArrayList();
        s561 s561Var = this.d;
        if (str != null && (bArr = (byte[]) s561Var.d.get(str)) != null) {
            arrayList.add(bArr);
        }
        byte[] bArr2 = (byte[]) s561Var.d.get("");
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        if (((adn0) den0Var.get()).b) {
            z = false;
        } else {
            AtomicLong atomicLong2 = this.m;
            if (atomicLong2.get() != 0) {
                ac00Var.getClass();
                if (ac00.b() - atomicLong2.get() < o) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        uny unyVar = this.g;
        if (zIsEmpty) {
            listK0 = z6x.a;
        } else {
            byte[][] bArr3 = (byte[][]) arrayList.toArray(new byte[0][]);
            ud00 ud00Var = this.a;
            ud00Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT eventName || '_' || hex(sequenceId) AS eventId, eventName, sequenceId,hex(sequenceId) AS sequenceStr,sequenceNumberNext, COUNT(sequenceNumber) AS storageSize,MIN(sequenceNumber) AS sequenceNumberMin FROM EventSequenceNumbers LEFT JOIN Events USING (eventName, sequenceId) WHERE sequenceId IN (");
            anm1.h(bArr3.length, sb);
            sb.append(") GROUP BY eventName, sequenceId, sequenceStr");
            listK0 = z561.k0(z561.T(fa00.d, new i46((List) qyo1.x(ud00Var.a, true, false, new f0z(sb.toString(), bArr3, (byte) 14)), (byte) 1)));
            if (z) {
                listK0 = unyVar.s(listK0);
            }
        }
        trz0 trz0Var = this.b;
        Map mapR = z ? unyVar.r(trz0Var.c()) : trz0Var.c();
        qav qavVar = this.c;
        EventSenderStats2NonAuth eventSenderStats2NonAuthA = pu51.a(listK0, mapR, z ? unyVar.q(qav.c(qavVar)) : qav.c(qavVar));
        if (eventSenderStats2NonAuthA.getSerializedSize() <= 102400) {
            return z561.h0(this.j.h(eventSenderStats2NonAuthA, n));
        }
        byte[] byteArray = t2p1.j("EventSenderStats2NonAuth").toByteArray();
        byte[] bArr4 = (byte[]) arrayList.get(0);
        ac00Var.getClass();
        this.f.c("RejectedClientEventNonAuth", byteArray, bArr4, false, (String) null, ac00.a(), ((adn0) den0Var.get()).l);
        return v7xVar;
    }
}
