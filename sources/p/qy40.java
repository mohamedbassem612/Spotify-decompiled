package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qy40 implements Function {
    public static final byte[] c = {26, 4, 77, 83, 70, 84, 34, 6, 69, 97, 114, 98, 117, 100};
    public final /* synthetic */ byte a;
    public final List b;

    public qy40(g5s g5sVar, eis eisVar, dis disVar, vun vunVar, p5a0 p5a0Var, e831 e831Var) {
        this.a = (byte) 2;
        this.b = p7h.M(new rfd[]{iqw0.b, iqw0.e, new kqw0(new dor(p5a0Var, (byte) 21), (byte) 2), iqw0.c, iqw0.d, new jqw0(new wsr(1, disVar, dis.class, "hasJoined", "hasJoined(Lcom/spotify/jam/jam/Jam$AvailableJam;)Z", 0, (byte) 7), (byte) 1), new jqw0(new wsr(1, eisVar, eis.class, "hasSeen", "hasSeen(Lcom/spotify/jam/jam/Jam$AvailableJam;)Z", 0, (byte) 8), (byte) 0), new lqw0(mqw0.b, new xx0(g5sVar, (lnm) null, (byte) 17)), new kqw0(vunVar, (byte) 1), new kqw0(e831Var, (byte) 0), iqw0.f});
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(p.hqw0 r7, p.qo90 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.ais
            if (r0 == 0) goto L13
            r0 = r9
            p.ais r0 = (p.ais) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.ais r0 = new p.ais
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L32
            int r6 = r0.d
            java.util.Iterator r7 = r0.c
            p.qo90 r8 = r0.b
            p.hqw0 r1 = r0.a
            p.hm5.M(r9)
            r5 = r0
            r0 = r8
            r8 = r1
        L30:
            r1 = r5
            goto L7a
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L39:
            p.hm5.M(r9)
            java.util.List r6 = r6.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r9 = r6 instanceof java.util.Collection
            if (r9 == 0) goto L4f
            r9 = r6
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L4f
        L4d:
            r2 = r3
            goto L86
        L4f:
            java.util.Iterator r6 = r6.iterator()
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r2
        L57:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r7.next()
            p.rfd r1 = (p.rfd) r1
            r0.a = r8
            r0.b = r9
            r0.c = r7
            r0.d = r6
            r0.g = r3
            java.lang.Object r1 = r1.a(r8, r9, r0)
            p.d9n r4 = p.d9n.a
            if (r1 != r4) goto L76
            return r4
        L76:
            r5 = r0
            r0 = r9
            r9 = r1
            goto L30
        L7a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L83
            goto L86
        L83:
            r9 = r0
            r0 = r1
            goto L57
        L86:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qy40.a(p.hqw0, p.qo90, p.onm):java.lang.Object");
    }

    public Object apply(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 1:
                return list;
            case 2:
            default:
                return sqg0.T(o7h.v1(list, ((CollectionPlatformEsperantoContainsResponse) obj).o().p()));
            case 3:
                List list2 = list;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list2) {
                    linkedHashMap.put(obj2, Boolean.FALSE);
                }
                return linkedHashMap;
        }
    }

    public qy40() {
        this.a = (byte) 0;
        this.b = Collections.singletonList(new gkt0());
    }

    public /* synthetic */ qy40(List list, byte b) {
        this.a = b;
        this.b = list;
    }
}
