package p;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.util.Size;
import android.view.Surface;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class am31 extends a8d1 implements vu30 {
    public final /* synthetic */ g931 N0;
    public final /* synthetic */ rl31 O0;
    public final /* synthetic */ iac0 P0;
    public float X;
    public byte Y;
    public /* synthetic */ Object Z;
    public gpj1 a;
    public Exception b;
    public muq0 c;
    public MediaCodec d;
    public Surface e;
    public MediaMuxer f;
    public x550 g;
    public l811 h;
    public Throwable i;
    public long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am31(g931 g931Var, rl31 rl31Var, iac0 iac0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.N0 = g931Var;
        this.O0 = rl31Var;
        this.P0 = iac0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        am31 am31Var = new am31(this.N0, this.O0, this.P0, lnmVar);
        am31Var.Z = obj;
        return am31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fc A[Catch: Exception -> 0x0305, CancellationException -> 0x0308, TRY_LEAVE, TryCatch #33 {CancellationException -> 0x0308, blocks: (B:145:0x039a, B:142:0x0365, B:115:0x02f6, B:117:0x02fc, B:128:0x0318, B:130:0x031e, B:135:0x0331, B:137:0x0337, B:138:0x033d, B:134:0x032d, B:127:0x0314, B:114:0x02f2, B:172:0x0435, B:174:0x043b, B:182:0x0451, B:184:0x0457, B:189:0x0468, B:191:0x046e, B:192:0x0474, B:188:0x0464, B:181:0x044d, B:171:0x0431), top: B:276:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:130:0x031e A[Catch: Exception -> 0x0305, CancellationException -> 0x0308, TRY_LEAVE, TryCatch #33 {CancellationException -> 0x0308, blocks: (B:145:0x039a, B:142:0x0365, B:115:0x02f6, B:117:0x02fc, B:128:0x0318, B:130:0x031e, B:135:0x0331, B:137:0x0337, B:138:0x033d, B:134:0x032d, B:127:0x0314, B:114:0x02f2, B:172:0x0435, B:174:0x043b, B:182:0x0451, B:184:0x0457, B:189:0x0468, B:191:0x046e, B:192:0x0474, B:188:0x0464, B:181:0x044d, B:171:0x0431), top: B:276:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0337 A[Catch: Exception -> 0x0305, CancellationException -> 0x0308, TryCatch #33 {CancellationException -> 0x0308, blocks: (B:145:0x039a, B:142:0x0365, B:115:0x02f6, B:117:0x02fc, B:128:0x0318, B:130:0x031e, B:135:0x0331, B:137:0x0337, B:138:0x033d, B:134:0x032d, B:127:0x0314, B:114:0x02f2, B:172:0x0435, B:174:0x043b, B:182:0x0451, B:184:0x0457, B:189:0x0468, B:191:0x046e, B:192:0x0474, B:188:0x0464, B:181:0x044d, B:171:0x0431), top: B:276:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0362  */
    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    /* JADX WARN: Code duplicated, block: B:144:0x0398  */
    /* JADX WARN: Code duplicated, block: B:174:0x043b A[Catch: CancellationException -> 0x0308, Exception -> 0x0442, TRY_LEAVE, TryCatch #33 {CancellationException -> 0x0308, blocks: (B:145:0x039a, B:142:0x0365, B:115:0x02f6, B:117:0x02fc, B:128:0x0318, B:130:0x031e, B:135:0x0331, B:137:0x0337, B:138:0x033d, B:134:0x032d, B:127:0x0314, B:114:0x02f2, B:172:0x0435, B:174:0x043b, B:182:0x0451, B:184:0x0457, B:189:0x0468, B:191:0x046e, B:192:0x0474, B:188:0x0464, B:181:0x044d, B:171:0x0431), top: B:276:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0457 A[Catch: CancellationException -> 0x0308, Exception -> 0x0442, TRY_LEAVE, TryCatch #33 {CancellationException -> 0x0308, blocks: (B:145:0x039a, B:142:0x0365, B:115:0x02f6, B:117:0x02fc, B:128:0x0318, B:130:0x031e, B:135:0x0331, B:137:0x0337, B:138:0x033d, B:134:0x032d, B:127:0x0314, B:114:0x02f2, B:172:0x0435, B:174:0x043b, B:182:0x0451, B:184:0x0457, B:189:0x0468, B:191:0x046e, B:192:0x0474, B:188:0x0464, B:181:0x044d, B:171:0x0431), top: B:276:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:191:0x046e A[Catch: CancellationException -> 0x0308, Exception -> 0x0442, TryCatch #33 {CancellationException -> 0x0308, blocks: (B:145:0x039a, B:142:0x0365, B:115:0x02f6, B:117:0x02fc, B:128:0x0318, B:130:0x031e, B:135:0x0331, B:137:0x0337, B:138:0x033d, B:134:0x032d, B:127:0x0314, B:114:0x02f2, B:172:0x0435, B:174:0x043b, B:182:0x0451, B:184:0x0457, B:189:0x0468, B:191:0x046e, B:192:0x0474, B:188:0x0464, B:181:0x044d, B:171:0x0431), top: B:276:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:195:0x049e  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x051f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:285:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019b A[Catch: Exception -> 0x04bb, CancellationException -> 0x04c0, PHI: r2 r5 r12
      0x019b: PHI (r2v14 p.gpj1) = (r2v8 p.gpj1), (r2v15 p.gpj1) binds: [B:62:0x0198, B:54:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r5v7 java.lang.Object) = (r5v6 java.lang.Object), (r5v12 java.lang.Object) binds: [B:62:0x0198, B:54:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r12v2 int) = (r12v0 int), (r12v3 int) binds: [B:62:0x0198, B:54:0x015c] A[DONT_GENERATE, DONT_INLINE], TryCatch #20 {CancellationException -> 0x04c0, blocks: (B:64:0x019b, B:66:0x01a3, B:59:0x0188, B:61:0x0191), top: B:260:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a3 A[Catch: Exception -> 0x04bb, CancellationException -> 0x04c0, TRY_LEAVE, TryCatch #20 {CancellationException -> 0x04c0, blocks: (B:64:0x019b, B:66:0x01a3, B:59:0x0188, B:61:0x0191), top: B:260:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x025d  */
    /* JADX WARN: Code duplicated, block: B:96:0x028e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, p.gpj1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, p.gpj1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v11, types: [p.ti31] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.media.MediaCodec, android.media.MediaMuxer, android.view.Surface, java.lang.Long, java.lang.Object, java.lang.Throwable, p.gpj1, p.l811, p.lnm, p.muq0, p.x550] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Exception, java.lang.Object, p.gpj1] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r1;
        ?? r8;
        ?? r2;
        ?? r3;
        int i;
        ?? r9;
        jpj1 jpj1Var;
        gpj1 gpj1Var;
        int i2;
        Object objA;
        Object objA2;
        gpj1 gpj1Var2;
        long jH;
        MediaCodec mediaCodecL;
        Surface surfaceCreateInputSurface;
        File file;
        MediaMuxer mediaMuxer;
        x550 x550Var;
        l811 l811Var;
        MediaCodec mediaCodec;
        MediaMuxer mediaMuxer2;
        String str;
        byte b;
        x550 x550Var2;
        String str2;
        String str3;
        muq0 muq0Var;
        Object objC;
        Surface surface;
        gpj1 gpj1Var3;
        MediaCodec mediaCodec2;
        l811 l811Var2;
        MediaMuxer mediaMuxer3;
        float fFloatValue;
        muq0 muq0Var2;
        float f;
        l811 l811Var3;
        MediaMuxer mediaMuxer4;
        long j;
        Throwable th;
        MediaCodec mediaCodec3;
        int i3;
        int i4;
        zl31 zl31Var;
        gpj1 gpj1Var4;
        long j2;
        MediaCodec mediaCodec4;
        m231 m231VarP;
        Throwable thA;
        m231 m231VarP2;
        Throwable thA2;
        m231 m231VarP3;
        Throwable thA3;
        geo0 geo0Var;
        ic01 ic01Var;
        Throwable th2;
        m231 m231VarP4;
        Throwable thA4;
        m231 m231VarP5;
        Throwable thA5;
        m231 m231VarP6;
        Throwable thA6;
        geo0 geo0Var2;
        ic01 ic01Var2;
        long j3;
        Long lQ;
        ipj1 ipj1Var;
        rl31 rl31Var = this.O0;
        ?? r4 = rl31Var.a;
        File file2 = rl31Var.c;
        r261 r261Var = (ssw0) this.Z;
        ?? r5 = this.Y;
        String str4 = "Failed to release muxer";
        String str5 = "Failed to release encoder surface";
        g931 g931Var = this.N0;
        m231 m231Var = rih1.a;
        file2 = d9n.a;
        try {
            try {
                try {
                    switch (r5) {
                        case 0:
                            hm5.M(obj);
                            gpj1Var = new gpj1((zle1) g931Var.c, r4);
                            kpj1 kpj1Var = new kpj1(0.0f);
                            this.Z = r261Var;
                            this.a = gpj1Var;
                            this.Y = (byte) 1;
                            if (r261Var.b(kpj1Var, this) != file2) {
                                try {
                                    try {
                                        hj31 hj31Var = (hj31) g931Var.d;
                                        this.Z = r261Var;
                                        this.a = gpj1Var;
                                        i2 = 2;
                                        try {
                                            this.Y = (byte) 2;
                                            objA = hj31Var.a(true, this);
                                            if (objA == file2) {
                                                if (!((Boolean) objA).booleanValue()) {
                                                    file2 = file2;
                                                    i = i2;
                                                    try {
                                                        throw new IllegalStateException("Rive initialization failed");
                                                    } catch (CancellationException e) {
                                                        e = e;
                                                        r2 = gpj1Var;
                                                        r8 = 0;
                                                        r3 = r2;
                                                        this.Z = r8;
                                                        this.a = r8;
                                                        this.b = e;
                                                        this.c = r8;
                                                        this.d = r8;
                                                        this.e = r8;
                                                        this.f = r8;
                                                        this.g = r8;
                                                        this.h = r8;
                                                        this.i = r8;
                                                        this.Y = (byte) 11;
                                                        r3.getClass();
                                                        if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                                                            return file2;
                                                        }
                                                        throw e;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        r2 = gpj1Var;
                                                        this.Z = r261Var;
                                                        r9 = 0;
                                                        this.a = null;
                                                        this.b = e;
                                                        this.c = null;
                                                        this.d = null;
                                                        this.e = null;
                                                        this.f = null;
                                                        this.g = null;
                                                        this.h = null;
                                                        this.i = null;
                                                        this.Y = (byte) 12;
                                                        r2.getClass();
                                                        if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                            return file2;
                                                        }
                                                        Logger.e(e, "Video generation failed", new Object[0]);
                                                        jpj1Var = new jpj1(e);
                                                        this.Z = r9;
                                                        this.a = r9;
                                                        this.b = r9;
                                                        this.Y = (byte) 13;
                                                        if (r261Var.b(jpj1Var, this) == file2) {
                                                            return file2;
                                                        }
                                                        return m231Var;
                                                    }
                                                }
                                                ?? r6 = (ti31) g931Var.b;
                                                Map map = rl31Var.d;
                                                this.Z = r261Var;
                                                this.a = gpj1Var;
                                                this.Y = (byte) 3;
                                                objA2 = r6.a(r4, gpj1Var, map, this);
                                                if (objA2 != file2) {
                                                    gpj1Var2 = gpj1Var;
                                                    try {
                                                        try {
                                                            oi31 oi31Var = (oi31) objA2;
                                                            muq0 muq0Var3 = new muq0();
                                                            ytw0 ytw0Var = jfv.b;
                                                            try {
                                                                jH = jfv.h(fdg1.k0(1, ngv.e)) / 30;
                                                                if (file2.exists()) {
                                                                    try {
                                                                        file2.delete();
                                                                    } catch (CancellationException e3) {
                                                                        e = e3;
                                                                        r1 = gpj1Var2;
                                                                        r8 = 0;
                                                                        r3 = r1;
                                                                        this.Z = r8;
                                                                        this.a = r8;
                                                                        this.b = e;
                                                                        this.c = r8;
                                                                        this.d = r8;
                                                                        this.e = r8;
                                                                        this.f = r8;
                                                                        this.g = r8;
                                                                        this.h = r8;
                                                                        this.i = r8;
                                                                        this.Y = (byte) 11;
                                                                        r3.getClass();
                                                                        if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                                                                            return file2;
                                                                        }
                                                                        throw e;
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        file2 = file2;
                                                                        r2 = gpj1Var2;
                                                                        i = 2;
                                                                        this.Z = r261Var;
                                                                        r9 = 0;
                                                                        this.a = null;
                                                                        this.b = e;
                                                                        this.c = null;
                                                                        this.d = null;
                                                                        this.e = null;
                                                                        this.f = null;
                                                                        this.g = null;
                                                                        this.h = null;
                                                                        this.i = null;
                                                                        this.Y = (byte) 12;
                                                                        r2.getClass();
                                                                        if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                                            return file2;
                                                                        }
                                                                        Logger.e(e, "Video generation failed", new Object[0]);
                                                                        jpj1Var = new jpj1(e);
                                                                        this.Z = r9;
                                                                        this.a = r9;
                                                                        this.b = r9;
                                                                        this.Y = (byte) 13;
                                                                        if (r261Var.b(jpj1Var, this) == file2) {
                                                                            return file2;
                                                                        }
                                                                    }
                                                                }
                                                                mediaCodecL = g931.l(muq0Var3);
                                                                try {
                                                                    surfaceCreateInputSurface = mediaCodecL.createInputSurface();
                                                                    file = file2;
                                                                    mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                                                                    x550Var = new x550();
                                                                    l811Var = new l811();
                                                                    try {
                                                                        iac0 iac0Var = this.P0;
                                                                        byte[] bArrB = oi31Var.b();
                                                                        try {
                                                                            Map mapC = oi31Var.c();
                                                                            Map mapA = oi31Var.a();
                                                                            List list = rl31Var.b;
                                                                            Size size = muq0Var3.a;
                                                                            this.Z = r261Var;
                                                                            this.a = gpj1Var2;
                                                                            this.b = null;
                                                                            this.c = muq0Var3;
                                                                            this.d = mediaCodecL;
                                                                            this.e = surfaceCreateInputSurface;
                                                                            this.f = mediaMuxer;
                                                                            this.g = x550Var;
                                                                            this.h = l811Var;
                                                                            this.t = jH;
                                                                            this.Y = (byte) 4;
                                                                            mediaCodec = mediaCodecL;
                                                                            mediaMuxer2 = mediaMuxer;
                                                                            file2 = file2;
                                                                            str2 = "Failed to release encoder";
                                                                            str3 = "Failed to release encoder surface";
                                                                            muq0Var = muq0Var3;
                                                                            try {
                                                                                objC = x550Var.c(iac0Var, bArrB, mapC, mapA, list, size, surfaceCreateInputSurface, this);
                                                                                if (objC == file2) {
                                                                                    return file2;
                                                                                }
                                                                                x550Var2 = x550Var;
                                                                                surface = surfaceCreateInputSurface;
                                                                                gpj1Var3 = gpj1Var2;
                                                                                mediaCodec2 = mediaCodec;
                                                                                l811Var2 = l811Var;
                                                                                mediaMuxer3 = mediaMuxer2;
                                                                                try {
                                                                                    fFloatValue = ((Number) objC).floatValue();
                                                                                    this.Z = r261Var;
                                                                                    this.a = gpj1Var3;
                                                                                    this.b = null;
                                                                                    this.c = muq0Var;
                                                                                    this.d = mediaCodec2;
                                                                                    this.e = surface;
                                                                                    this.f = mediaMuxer3;
                                                                                    this.g = x550Var2;
                                                                                    this.h = l811Var2;
                                                                                    this.t = jH;
                                                                                    this.X = fFloatValue;
                                                                                    this.Y = (byte) 5;
                                                                                    if (gpj1Var3.d(fFloatValue, this) == file2) {
                                                                                        return file2;
                                                                                    }
                                                                                    muq0Var2 = muq0Var;
                                                                                    f = fFloatValue;
                                                                                    l811Var3 = l811Var2;
                                                                                    mediaMuxer4 = mediaMuxer3;
                                                                                    x550Var2 = x550Var2;
                                                                                    j = jH;
                                                                                    try {
                                                                                        muq0Var2.getClass();
                                                                                        i3 = (int) (30.0f * f);
                                                                                        if (i3 < 0) {
                                                                                            i4 = 0;
                                                                                        } else {
                                                                                            i4 = i3;
                                                                                        }
                                                                                        try {
                                                                                            b = 17;
                                                                                            gpj1Var4 = gpj1Var3;
                                                                                            str4 = "Failed to release muxer";
                                                                                            mediaCodec3 = mediaCodec2;
                                                                                            try {
                                                                                                zl31Var = new zl31(i4, j, mediaCodec3, mediaMuxer4, null, x550Var2, muq0Var2, r261Var, l811Var3, g931Var, gpj1Var4);
                                                                                                mediaMuxer4 = mediaMuxer4;
                                                                                                x550Var2 = x550Var2;
                                                                                                r261Var = r261Var;
                                                                                                gpj1Var3 = gpj1Var4;
                                                                                                try {
                                                                                                    this.Z = r261Var;
                                                                                                    this.a = gpj1Var3;
                                                                                                    this.b = null;
                                                                                                    this.c = null;
                                                                                                    this.d = mediaCodec3;
                                                                                                    this.e = surface;
                                                                                                    this.f = mediaMuxer4;
                                                                                                    this.g = x550Var2;
                                                                                                    this.h = null;
                                                                                                    this.t = j;
                                                                                                    this.X = f;
                                                                                                    this.Y = (byte) 6;
                                                                                                    if (gpj1Var3.b.g("video_encoding", zl31Var, this) == file2) {
                                                                                                        return file2;
                                                                                                    }
                                                                                                    gpj1Var2 = gpj1Var3;
                                                                                                    j2 = j;
                                                                                                    mediaCodec4 = mediaCodec3;
                                                                                                    try {
                                                                                                        surface.release();
                                                                                                        m231VarP4 = m231Var;
                                                                                                    } catch (Throwable th3) {
                                                                                                        try {
                                                                                                            m231VarP4 = hm5.p(th3);
                                                                                                        } catch (Exception e5) {
                                                                                                            e = e5;
                                                                                                            r2 = gpj1Var2;
                                                                                                            i = 2;
                                                                                                            this.Z = r261Var;
                                                                                                            r9 = 0;
                                                                                                            this.a = null;
                                                                                                            this.b = e;
                                                                                                            this.c = null;
                                                                                                            this.d = null;
                                                                                                            this.e = null;
                                                                                                            this.f = null;
                                                                                                            this.g = null;
                                                                                                            this.h = null;
                                                                                                            this.i = null;
                                                                                                            this.Y = (byte) 12;
                                                                                                            r2.getClass();
                                                                                                            if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                                                                                return file2;
                                                                                                            }
                                                                                                            Logger.e(e, "Video generation failed", new Object[0]);
                                                                                                            jpj1Var = new jpj1(e);
                                                                                                            this.Z = r9;
                                                                                                            this.a = r9;
                                                                                                            this.b = r9;
                                                                                                            this.Y = (byte) 13;
                                                                                                            if (r261Var.b(jpj1Var, this) == file2) {
                                                                                                                return file2;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    thA4 = e331.a(m231VarP4);
                                                                                                    if (thA4 != null) {
                                                                                                        Logger.e(thA4, str3, new Object[0]);
                                                                                                    }
                                                                                                    try {
                                                                                                        mediaCodec4.release();
                                                                                                        m231VarP5 = m231Var;
                                                                                                    } catch (Throwable th4) {
                                                                                                        m231VarP5 = hm5.p(th4);
                                                                                                    }
                                                                                                    thA5 = e331.a(m231VarP5);
                                                                                                    if (thA5 != null) {
                                                                                                        Logger.e(thA5, str2, new Object[0]);
                                                                                                    }
                                                                                                    try {
                                                                                                        mediaMuxer4.release();
                                                                                                        m231VarP6 = m231Var;
                                                                                                    } catch (Throwable th5) {
                                                                                                        m231VarP6 = hm5.p(th5);
                                                                                                    }
                                                                                                    thA6 = e331.a(m231VarP6);
                                                                                                    if (thA6 != null) {
                                                                                                        Logger.e(thA6, str4, new Object[0]);
                                                                                                    }
                                                                                                    geo0Var2 = geo0.b;
                                                                                                    ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                                                                                                    this.Z = r261Var;
                                                                                                    this.a = gpj1Var2;
                                                                                                    this.b = null;
                                                                                                    this.c = null;
                                                                                                    this.d = null;
                                                                                                    this.e = null;
                                                                                                    this.f = null;
                                                                                                    this.g = null;
                                                                                                    this.h = null;
                                                                                                    this.t = j2;
                                                                                                    this.Y = (byte) 7;
                                                                                                    if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                                                                                        return file2;
                                                                                                    }
                                                                                                    j3 = j2;
                                                                                                    lQ = yah0.q(file.length());
                                                                                                    this.Z = r261Var;
                                                                                                    this.a = gpj1Var2;
                                                                                                    this.b = null;
                                                                                                    this.c = null;
                                                                                                    this.d = null;
                                                                                                    this.e = null;
                                                                                                    this.f = null;
                                                                                                    this.g = null;
                                                                                                    this.h = null;
                                                                                                    this.t = j3;
                                                                                                    this.Y = (byte) 9;
                                                                                                    gpj1Var2.getClass();
                                                                                                    if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                                                                                        return file2;
                                                                                                    }
                                                                                                    ipj1Var = new ipj1(file.getAbsolutePath());
                                                                                                    this.Z = r261Var;
                                                                                                    this.a = gpj1Var2;
                                                                                                    this.b = null;
                                                                                                    this.c = null;
                                                                                                    this.d = null;
                                                                                                    this.e = null;
                                                                                                    this.f = null;
                                                                                                    this.g = null;
                                                                                                    this.h = null;
                                                                                                    this.t = j3;
                                                                                                    this.Y = (byte) 10;
                                                                                                    if (r261Var.b(ipj1Var, this) == file2) {
                                                                                                        return file2;
                                                                                                    }
                                                                                                    return m231Var;
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    surfaceCreateInputSurface = surface;
                                                                                                    mediaMuxer2 = mediaMuxer4;
                                                                                                    jH = j;
                                                                                                    mediaCodec = mediaCodec3;
                                                                                                    str = str2;
                                                                                                    str5 = str3;
                                                                                                    str4 = str4;
                                                                                                    gpj1Var2 = gpj1Var3;
                                                                                                    i = 2;
                                                                                                    th = th;
                                                                                                    try {
                                                                                                        surfaceCreateInputSurface.release();
                                                                                                        m231VarP = m231Var;
                                                                                                    } catch (Throwable th7) {
                                                                                                        try {
                                                                                                            m231VarP = hm5.p(th7);
                                                                                                        } catch (Exception e6) {
                                                                                                            e = e6;
                                                                                                            r2 = gpj1Var2;
                                                                                                            this.Z = r261Var;
                                                                                                            r9 = 0;
                                                                                                            this.a = null;
                                                                                                            this.b = e;
                                                                                                            this.c = null;
                                                                                                            this.d = null;
                                                                                                            this.e = null;
                                                                                                            this.f = null;
                                                                                                            this.g = null;
                                                                                                            this.h = null;
                                                                                                            this.i = null;
                                                                                                            this.Y = (byte) 12;
                                                                                                            r2.getClass();
                                                                                                            if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                                                                                return file2;
                                                                                                            }
                                                                                                            Logger.e(e, "Video generation failed", new Object[0]);
                                                                                                            jpj1Var = new jpj1(e);
                                                                                                            this.Z = r9;
                                                                                                            this.a = r9;
                                                                                                            this.b = r9;
                                                                                                            this.Y = (byte) 13;
                                                                                                            if (r261Var.b(jpj1Var, this) == file2) {
                                                                                                                return file2;
                                                                                                            }
                                                                                                            return m231Var;
                                                                                                        }
                                                                                                    }
                                                                                                    thA = e331.a(m231VarP);
                                                                                                    if (thA != null) {
                                                                                                        Logger.e(thA, str5, new Object[0]);
                                                                                                    }
                                                                                                    try {
                                                                                                        mediaCodec.release();
                                                                                                        m231VarP2 = m231Var;
                                                                                                    } catch (Throwable th8) {
                                                                                                        m231VarP2 = hm5.p(th8);
                                                                                                    }
                                                                                                    thA2 = e331.a(m231VarP2);
                                                                                                    if (thA2 != null) {
                                                                                                        Logger.e(thA2, str, new Object[0]);
                                                                                                    }
                                                                                                    try {
                                                                                                        mediaMuxer2.release();
                                                                                                        m231VarP3 = m231Var;
                                                                                                    } catch (Throwable th9) {
                                                                                                        m231VarP3 = hm5.p(th9);
                                                                                                    }
                                                                                                    thA3 = e331.a(m231VarP3);
                                                                                                    if (thA3 != null) {
                                                                                                        Logger.e(thA3, str4, new Object[0]);
                                                                                                    }
                                                                                                    geo0Var = geo0.b;
                                                                                                    ic01Var = new ic01(x550Var2, (lnm) null, b);
                                                                                                    this.Z = r261Var;
                                                                                                    this.a = gpj1Var2;
                                                                                                    this.b = null;
                                                                                                    this.c = null;
                                                                                                    this.d = null;
                                                                                                    this.e = null;
                                                                                                    this.f = null;
                                                                                                    this.g = null;
                                                                                                    this.h = null;
                                                                                                    this.i = th;
                                                                                                    this.t = jH;
                                                                                                    this.Y = (byte) 8;
                                                                                                    if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                                                                                        return file2;
                                                                                                    }
                                                                                                    th2 = th;
                                                                                                    r2 = gpj1Var2;
                                                                                                    try {
                                                                                                        throw th2;
                                                                                                    } catch (CancellationException e7) {
                                                                                                        e = e7;
                                                                                                        r8 = 0;
                                                                                                        r3 = r2;
                                                                                                        this.Z = r8;
                                                                                                        this.a = r8;
                                                                                                        this.b = e;
                                                                                                        this.c = r8;
                                                                                                        this.d = r8;
                                                                                                        this.e = r8;
                                                                                                        this.f = r8;
                                                                                                        this.g = r8;
                                                                                                        this.h = r8;
                                                                                                        this.i = r8;
                                                                                                        this.Y = (byte) 11;
                                                                                                        r3.getClass();
                                                                                                        if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                                                                                                            return file2;
                                                                                                        }
                                                                                                        throw e;
                                                                                                    } catch (Exception e8) {
                                                                                                        e = e8;
                                                                                                        this.Z = r261Var;
                                                                                                        r9 = 0;
                                                                                                        this.a = null;
                                                                                                        this.b = e;
                                                                                                        this.c = null;
                                                                                                        this.d = null;
                                                                                                        this.e = null;
                                                                                                        this.f = null;
                                                                                                        this.g = null;
                                                                                                        this.h = null;
                                                                                                        this.i = null;
                                                                                                        this.Y = (byte) 12;
                                                                                                        r2.getClass();
                                                                                                        if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                                                                            return file2;
                                                                                                        }
                                                                                                        Logger.e(e, "Video generation failed", new Object[0]);
                                                                                                        jpj1Var = new jpj1(e);
                                                                                                        this.Z = r9;
                                                                                                        this.a = r9;
                                                                                                        this.b = r9;
                                                                                                        this.Y = (byte) 13;
                                                                                                        if (r261Var.b(jpj1Var, this) == file2) {
                                                                                                            return file2;
                                                                                                        }
                                                                                                        return m231Var;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th10) {
                                                                                                th = th10;
                                                                                                mediaMuxer4 = mediaMuxer4;
                                                                                                x550Var2 = x550Var2;
                                                                                                r261Var = r261Var;
                                                                                                gpj1Var3 = gpj1Var4;
                                                                                            }
                                                                                        } catch (Throwable th11) {
                                                                                            th = th11;
                                                                                            r261Var = r261Var;
                                                                                            b = 17;
                                                                                            mediaCodec3 = mediaCodec2;
                                                                                            surfaceCreateInputSurface = surface;
                                                                                            mediaMuxer2 = mediaMuxer4;
                                                                                            jH = j;
                                                                                            mediaCodec = mediaCodec3;
                                                                                            str = str2;
                                                                                            str5 = str3;
                                                                                            str4 = str4;
                                                                                            gpj1Var2 = gpj1Var3;
                                                                                            i = 2;
                                                                                            th = th;
                                                                                            surfaceCreateInputSurface.release();
                                                                                            m231VarP = m231Var;
                                                                                            thA = e331.a(m231VarP);
                                                                                            if (thA != null) {
                                                                                                Logger.e(thA, str5, new Object[0]);
                                                                                            }
                                                                                            mediaCodec.release();
                                                                                            m231VarP2 = m231Var;
                                                                                            thA2 = e331.a(m231VarP2);
                                                                                            if (thA2 != null) {
                                                                                                Logger.e(thA2, str, new Object[0]);
                                                                                            }
                                                                                            mediaMuxer2.release();
                                                                                            m231VarP3 = m231Var;
                                                                                            thA3 = e331.a(m231VarP3);
                                                                                            if (thA3 != null) {
                                                                                                Logger.e(thA3, str4, new Object[0]);
                                                                                            }
                                                                                            geo0Var = geo0.b;
                                                                                            ic01Var = new ic01(x550Var2, (lnm) null, b);
                                                                                            this.Z = r261Var;
                                                                                            this.a = gpj1Var2;
                                                                                            this.b = null;
                                                                                            this.c = null;
                                                                                            this.d = null;
                                                                                            this.e = null;
                                                                                            this.f = null;
                                                                                            this.g = null;
                                                                                            this.h = null;
                                                                                            this.i = th;
                                                                                            this.t = jH;
                                                                                            this.Y = (byte) 8;
                                                                                            if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                                                                                return file2;
                                                                                            }
                                                                                            th2 = th;
                                                                                            r2 = gpj1Var2;
                                                                                            throw th2;
                                                                                        }
                                                                                    } catch (Throwable th12) {
                                                                                        th = th12;
                                                                                    }
                                                                                } catch (Throwable th13) {
                                                                                    th = th13;
                                                                                    b = 17;
                                                                                    gpj1Var2 = gpj1Var3;
                                                                                    mediaMuxer2 = mediaMuxer3;
                                                                                    mediaCodec = mediaCodec2;
                                                                                    surfaceCreateInputSurface = surface;
                                                                                    str = str2;
                                                                                    str5 = str3;
                                                                                    i = 2;
                                                                                    th = th;
                                                                                    surfaceCreateInputSurface.release();
                                                                                    m231VarP = m231Var;
                                                                                    thA = e331.a(m231VarP);
                                                                                    if (thA != null) {
                                                                                        Logger.e(thA, str5, new Object[0]);
                                                                                    }
                                                                                    mediaCodec.release();
                                                                                    m231VarP2 = m231Var;
                                                                                    thA2 = e331.a(m231VarP2);
                                                                                    if (thA2 != null) {
                                                                                        Logger.e(thA2, str, new Object[0]);
                                                                                    }
                                                                                    mediaMuxer2.release();
                                                                                    m231VarP3 = m231Var;
                                                                                    thA3 = e331.a(m231VarP3);
                                                                                    if (thA3 != null) {
                                                                                        Logger.e(thA3, str4, new Object[0]);
                                                                                    }
                                                                                    geo0Var = geo0.b;
                                                                                    ic01Var = new ic01(x550Var2, (lnm) null, b);
                                                                                    this.Z = r261Var;
                                                                                    this.a = gpj1Var2;
                                                                                    this.b = null;
                                                                                    this.c = null;
                                                                                    this.d = null;
                                                                                    this.e = null;
                                                                                    this.f = null;
                                                                                    this.g = null;
                                                                                    this.h = null;
                                                                                    this.i = th;
                                                                                    this.t = jH;
                                                                                    this.Y = (byte) 8;
                                                                                    if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                                                                        return file2;
                                                                                    }
                                                                                    th2 = th;
                                                                                    r2 = gpj1Var2;
                                                                                    throw th2;
                                                                                }
                                                                            } catch (Throwable th14) {
                                                                                th = th14;
                                                                                str = str2;
                                                                                str5 = str3;
                                                                                b = 17;
                                                                                i = 2;
                                                                                x550Var2 = x550Var;
                                                                                th = th;
                                                                                surfaceCreateInputSurface.release();
                                                                                m231VarP = m231Var;
                                                                                thA = e331.a(m231VarP);
                                                                                if (thA != null) {
                                                                                    Logger.e(thA, str5, new Object[0]);
                                                                                }
                                                                                mediaCodec.release();
                                                                                m231VarP2 = m231Var;
                                                                                thA2 = e331.a(m231VarP2);
                                                                                if (thA2 != null) {
                                                                                    Logger.e(thA2, str, new Object[0]);
                                                                                }
                                                                                mediaMuxer2.release();
                                                                                m231VarP3 = m231Var;
                                                                                thA3 = e331.a(m231VarP3);
                                                                                if (thA3 != null) {
                                                                                    Logger.e(thA3, str4, new Object[0]);
                                                                                }
                                                                                geo0Var = geo0.b;
                                                                                ic01Var = new ic01(x550Var2, (lnm) null, b);
                                                                                this.Z = r261Var;
                                                                                this.a = gpj1Var2;
                                                                                this.b = null;
                                                                                this.c = null;
                                                                                this.d = null;
                                                                                this.e = null;
                                                                                this.f = null;
                                                                                this.g = null;
                                                                                this.h = null;
                                                                                this.i = th;
                                                                                this.t = jH;
                                                                                this.Y = (byte) 8;
                                                                                if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                                                                    return file2;
                                                                                }
                                                                                th2 = th;
                                                                                r2 = gpj1Var2;
                                                                                throw th2;
                                                                            }
                                                                        } catch (Throwable th15) {
                                                                            th = th15;
                                                                            mediaCodec = mediaCodecL;
                                                                            mediaMuxer2 = mediaMuxer;
                                                                            file2 = file2;
                                                                            str = "Failed to release encoder";
                                                                            str5 = "Failed to release encoder surface";
                                                                        }
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                        mediaCodec = mediaCodecL;
                                                                        mediaMuxer2 = mediaMuxer;
                                                                        file2 = file2;
                                                                        str = "Failed to release encoder";
                                                                        b = 17;
                                                                        str5 = "Failed to release encoder surface";
                                                                    }
                                                                } catch (CancellationException e9) {
                                                                    e = e9;
                                                                    file2 = file2;
                                                                    r2 = gpj1Var2;
                                                                    r8 = 0;
                                                                    r3 = r2;
                                                                    this.Z = r8;
                                                                    this.a = r8;
                                                                    this.b = e;
                                                                    this.c = r8;
                                                                    this.d = r8;
                                                                    this.e = r8;
                                                                    this.f = r8;
                                                                    this.g = r8;
                                                                    this.h = r8;
                                                                    this.i = r8;
                                                                    this.Y = (byte) 11;
                                                                    r3.getClass();
                                                                    if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                                                                        return file2;
                                                                    }
                                                                    throw e;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    file2 = file2;
                                                                    i = 2;
                                                                    r2 = gpj1Var2;
                                                                    this.Z = r261Var;
                                                                    r9 = 0;
                                                                    this.a = null;
                                                                    this.b = e;
                                                                    this.c = null;
                                                                    this.d = null;
                                                                    this.e = null;
                                                                    this.f = null;
                                                                    this.g = null;
                                                                    this.h = null;
                                                                    this.i = null;
                                                                    this.Y = (byte) 12;
                                                                    r2.getClass();
                                                                    if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                                        return file2;
                                                                    }
                                                                    Logger.e(e, "Video generation failed", new Object[0]);
                                                                    jpj1Var = new jpj1(e);
                                                                    this.Z = r9;
                                                                    this.a = r9;
                                                                    this.b = r9;
                                                                    this.Y = (byte) 13;
                                                                    if (r261Var.b(jpj1Var, this) == file2) {
                                                                        return file2;
                                                                    }
                                                                }
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                file2 = file2;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            file2 = file2;
                                                            i = i2;
                                                        }
                                                    } catch (CancellationException e13) {
                                                        e = e13;
                                                        file2 = file2;
                                                    }
                                                }
                                                break;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            file2 = file2;
                                            i = i2;
                                            r2 = gpj1Var;
                                            this.Z = r261Var;
                                            r9 = 0;
                                            this.a = null;
                                            this.b = e;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = null;
                                            this.h = null;
                                            this.i = null;
                                            this.Y = (byte) 12;
                                            r2.getClass();
                                            if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                                return file2;
                                            }
                                            Logger.e(e, "Video generation failed", new Object[0]);
                                            jpj1Var = new jpj1(e);
                                            this.Z = r9;
                                            this.a = r9;
                                            this.b = r9;
                                            this.Y = (byte) 13;
                                            if (r261Var.b(jpj1Var, this) == file2) {
                                                return file2;
                                            }
                                            return m231Var;
                                        }
                                    } catch (CancellationException e15) {
                                        e = e15;
                                        file2 = file2;
                                        r2 = gpj1Var;
                                        r8 = 0;
                                        r3 = r2;
                                        this.Z = r8;
                                        this.a = r8;
                                        this.b = e;
                                        this.c = r8;
                                        this.d = r8;
                                        this.e = r8;
                                        this.f = r8;
                                        this.g = r8;
                                        this.h = r8;
                                        this.i = r8;
                                        this.Y = (byte) 11;
                                        r3.getClass();
                                        if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                                            return file2;
                                        }
                                        throw e;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    file2 = file2;
                                    i = 2;
                                    r2 = gpj1Var;
                                    this.Z = r261Var;
                                    r9 = 0;
                                    this.a = null;
                                    this.b = e;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = null;
                                    this.i = null;
                                    this.Y = (byte) 12;
                                    r2.getClass();
                                    if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                                        return file2;
                                    }
                                    Logger.e(e, "Video generation failed", new Object[0]);
                                    jpj1Var = new jpj1(e);
                                    this.Z = r9;
                                    this.a = r9;
                                    this.b = r9;
                                    this.Y = (byte) 13;
                                    if (r261Var.b(jpj1Var, this) == file2) {
                                        return file2;
                                    }
                                    return m231Var;
                                }
                            }
                            return file2;
                        case 1:
                            gpj1Var = this.a;
                            hm5.M(obj);
                            hj31 hj31Var2 = (hj31) g931Var.d;
                            this.Z = r261Var;
                            this.a = gpj1Var;
                            i2 = 2;
                            this.Y = (byte) 2;
                            objA = hj31Var2.a(true, this);
                            if (objA == file2) {
                                if (!((Boolean) objA).booleanValue()) {
                                    file2 = file2;
                                    i = i2;
                                    throw new IllegalStateException("Rive initialization failed");
                                }
                                ?? r7 = (ti31) g931Var.b;
                                Map map2 = rl31Var.d;
                                this.Z = r261Var;
                                this.a = gpj1Var;
                                this.Y = (byte) 3;
                                objA2 = r7.a(r4, gpj1Var, map2, this);
                                if (objA2 != file2) {
                                    gpj1Var2 = gpj1Var;
                                    oi31 oi31Var2 = (oi31) objA2;
                                    muq0 muq0Var4 = new muq0();
                                    ytw0 ytw0Var2 = jfv.b;
                                    jH = jfv.h(fdg1.k0(1, ngv.e)) / 30;
                                    if (file2.exists()) {
                                        file2.delete();
                                        break;
                                    }
                                    mediaCodecL = g931.l(muq0Var4);
                                    surfaceCreateInputSurface = mediaCodecL.createInputSurface();
                                    file = file2;
                                    mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                                    x550Var = new x550();
                                    l811Var = new l811();
                                    iac0 iac0Var2 = this.P0;
                                    byte[] bArrB2 = oi31Var2.b();
                                    Map mapC2 = oi31Var2.c();
                                    Map mapA2 = oi31Var2.a();
                                    List list2 = rl31Var.b;
                                    Size size2 = muq0Var4.a;
                                    this.Z = r261Var;
                                    this.a = gpj1Var2;
                                    this.b = null;
                                    this.c = muq0Var4;
                                    this.d = mediaCodecL;
                                    this.e = surfaceCreateInputSurface;
                                    this.f = mediaMuxer;
                                    this.g = x550Var;
                                    this.h = l811Var;
                                    this.t = jH;
                                    this.Y = (byte) 4;
                                    mediaCodec = mediaCodecL;
                                    mediaMuxer2 = mediaMuxer;
                                    file2 = file2;
                                    str2 = "Failed to release encoder";
                                    str3 = "Failed to release encoder surface";
                                    muq0Var = muq0Var4;
                                    objC = x550Var.c(iac0Var2, bArrB2, mapC2, mapA2, list2, size2, surfaceCreateInputSurface, this);
                                    if (objC == file2) {
                                        return file2;
                                    }
                                    x550Var2 = x550Var;
                                    surface = surfaceCreateInputSurface;
                                    gpj1Var3 = gpj1Var2;
                                    mediaCodec2 = mediaCodec;
                                    l811Var2 = l811Var;
                                    mediaMuxer3 = mediaMuxer2;
                                    fFloatValue = ((Number) objC).floatValue();
                                    this.Z = r261Var;
                                    this.a = gpj1Var3;
                                    this.b = null;
                                    this.c = muq0Var;
                                    this.d = mediaCodec2;
                                    this.e = surface;
                                    this.f = mediaMuxer3;
                                    this.g = x550Var2;
                                    this.h = l811Var2;
                                    this.t = jH;
                                    this.X = fFloatValue;
                                    this.Y = (byte) 5;
                                    if (gpj1Var3.d(fFloatValue, this) == file2) {
                                        return file2;
                                    }
                                    muq0Var2 = muq0Var;
                                    f = fFloatValue;
                                    l811Var3 = l811Var2;
                                    mediaMuxer4 = mediaMuxer3;
                                    x550Var2 = x550Var2;
                                    j = jH;
                                    muq0Var2.getClass();
                                    i3 = (int) (30.0f * f);
                                    if (i3 < 0) {
                                        i4 = 0;
                                    } else {
                                        i4 = i3;
                                    }
                                    b = 17;
                                    gpj1Var4 = gpj1Var3;
                                    str4 = "Failed to release muxer";
                                    mediaCodec3 = mediaCodec2;
                                    zl31Var = new zl31(i4, j, mediaCodec3, mediaMuxer4, null, x550Var2, muq0Var2, r261Var, l811Var3, g931Var, gpj1Var4);
                                    mediaMuxer4 = mediaMuxer4;
                                    x550Var2 = x550Var2;
                                    r261Var = r261Var;
                                    gpj1Var3 = gpj1Var4;
                                    this.Z = r261Var;
                                    this.a = gpj1Var3;
                                    this.b = null;
                                    this.c = null;
                                    this.d = mediaCodec3;
                                    this.e = surface;
                                    this.f = mediaMuxer4;
                                    this.g = x550Var2;
                                    this.h = null;
                                    this.t = j;
                                    this.X = f;
                                    this.Y = (byte) 6;
                                    if (gpj1Var3.b.g("video_encoding", zl31Var, this) == file2) {
                                        return file2;
                                    }
                                    gpj1Var2 = gpj1Var3;
                                    j2 = j;
                                    mediaCodec4 = mediaCodec3;
                                    surface.release();
                                    m231VarP4 = m231Var;
                                    thA4 = e331.a(m231VarP4);
                                    if (thA4 != null) {
                                        Logger.e(thA4, str3, new Object[0]);
                                    }
                                    mediaCodec4.release();
                                    m231VarP5 = m231Var;
                                    thA5 = e331.a(m231VarP5);
                                    if (thA5 != null) {
                                        Logger.e(thA5, str2, new Object[0]);
                                    }
                                    mediaMuxer4.release();
                                    m231VarP6 = m231Var;
                                    thA6 = e331.a(m231VarP6);
                                    if (thA6 != null) {
                                        Logger.e(thA6, str4, new Object[0]);
                                    }
                                    geo0Var2 = geo0.b;
                                    ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                                    this.Z = r261Var;
                                    this.a = gpj1Var2;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = null;
                                    this.t = j2;
                                    this.Y = (byte) 7;
                                    if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                        return file2;
                                    }
                                    j3 = j2;
                                    lQ = yah0.q(file.length());
                                    this.Z = r261Var;
                                    this.a = gpj1Var2;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = null;
                                    this.t = j3;
                                    this.Y = (byte) 9;
                                    gpj1Var2.getClass();
                                    if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                        return file2;
                                    }
                                    ipj1Var = new ipj1(file.getAbsolutePath());
                                    this.Z = r261Var;
                                    this.a = gpj1Var2;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = null;
                                    this.t = j3;
                                    this.Y = (byte) 10;
                                    if (r261Var.b(ipj1Var, this) == file2) {
                                        return file2;
                                    }
                                    return m231Var;
                                }
                            }
                            return file2;
                        case 2:
                            gpj1Var = this.a;
                            hm5.M(obj);
                            objA = obj;
                            i2 = 2;
                            if (!((Boolean) objA).booleanValue()) {
                                file2 = file2;
                                i = i2;
                                throw new IllegalStateException("Rive initialization failed");
                            }
                            ?? r10 = (ti31) g931Var.b;
                            Map map3 = rl31Var.d;
                            this.Z = r261Var;
                            this.a = gpj1Var;
                            this.Y = (byte) 3;
                            objA2 = r10.a(r4, gpj1Var, map3, this);
                            if (objA2 != file2) {
                                gpj1Var2 = gpj1Var;
                                oi31 oi31Var3 = (oi31) objA2;
                                muq0 muq0Var5 = new muq0();
                                ytw0 ytw0Var3 = jfv.b;
                                jH = jfv.h(fdg1.k0(1, ngv.e)) / 30;
                                if (file2.exists()) {
                                    file2.delete();
                                    break;
                                }
                                mediaCodecL = g931.l(muq0Var5);
                                surfaceCreateInputSurface = mediaCodecL.createInputSurface();
                                file = file2;
                                mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                                x550Var = new x550();
                                l811Var = new l811();
                                iac0 iac0Var3 = this.P0;
                                byte[] bArrB3 = oi31Var3.b();
                                Map mapC3 = oi31Var3.c();
                                Map mapA3 = oi31Var3.a();
                                List list3 = rl31Var.b;
                                Size size3 = muq0Var5.a;
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = muq0Var5;
                                this.d = mediaCodecL;
                                this.e = surfaceCreateInputSurface;
                                this.f = mediaMuxer;
                                this.g = x550Var;
                                this.h = l811Var;
                                this.t = jH;
                                this.Y = (byte) 4;
                                mediaCodec = mediaCodecL;
                                mediaMuxer2 = mediaMuxer;
                                file2 = file2;
                                str2 = "Failed to release encoder";
                                str3 = "Failed to release encoder surface";
                                muq0Var = muq0Var5;
                                objC = x550Var.c(iac0Var3, bArrB3, mapC3, mapA3, list3, size3, surfaceCreateInputSurface, this);
                                if (objC == file2) {
                                    return file2;
                                }
                                x550Var2 = x550Var;
                                surface = surfaceCreateInputSurface;
                                gpj1Var3 = gpj1Var2;
                                mediaCodec2 = mediaCodec;
                                l811Var2 = l811Var;
                                mediaMuxer3 = mediaMuxer2;
                                fFloatValue = ((Number) objC).floatValue();
                                this.Z = r261Var;
                                this.a = gpj1Var3;
                                this.b = null;
                                this.c = muq0Var;
                                this.d = mediaCodec2;
                                this.e = surface;
                                this.f = mediaMuxer3;
                                this.g = x550Var2;
                                this.h = l811Var2;
                                this.t = jH;
                                this.X = fFloatValue;
                                this.Y = (byte) 5;
                                if (gpj1Var3.d(fFloatValue, this) == file2) {
                                    return file2;
                                }
                                muq0Var2 = muq0Var;
                                f = fFloatValue;
                                l811Var3 = l811Var2;
                                mediaMuxer4 = mediaMuxer3;
                                x550Var2 = x550Var2;
                                j = jH;
                                muq0Var2.getClass();
                                i3 = (int) (30.0f * f);
                                if (i3 < 0) {
                                    i4 = 0;
                                } else {
                                    i4 = i3;
                                }
                                b = 17;
                                gpj1Var4 = gpj1Var3;
                                str4 = "Failed to release muxer";
                                mediaCodec3 = mediaCodec2;
                                zl31Var = new zl31(i4, j, mediaCodec3, mediaMuxer4, null, x550Var2, muq0Var2, r261Var, l811Var3, g931Var, gpj1Var4);
                                mediaMuxer4 = mediaMuxer4;
                                x550Var2 = x550Var2;
                                r261Var = r261Var;
                                gpj1Var3 = gpj1Var4;
                                this.Z = r261Var;
                                this.a = gpj1Var3;
                                this.b = null;
                                this.c = null;
                                this.d = mediaCodec3;
                                this.e = surface;
                                this.f = mediaMuxer4;
                                this.g = x550Var2;
                                this.h = null;
                                this.t = j;
                                this.X = f;
                                this.Y = (byte) 6;
                                if (gpj1Var3.b.g("video_encoding", zl31Var, this) == file2) {
                                    return file2;
                                }
                                gpj1Var2 = gpj1Var3;
                                j2 = j;
                                mediaCodec4 = mediaCodec3;
                                surface.release();
                                m231VarP4 = m231Var;
                                thA4 = e331.a(m231VarP4);
                                if (thA4 != null) {
                                    Logger.e(thA4, str3, new Object[0]);
                                }
                                mediaCodec4.release();
                                m231VarP5 = m231Var;
                                thA5 = e331.a(m231VarP5);
                                if (thA5 != null) {
                                    Logger.e(thA5, str2, new Object[0]);
                                }
                                mediaMuxer4.release();
                                m231VarP6 = m231Var;
                                thA6 = e331.a(m231VarP6);
                                if (thA6 != null) {
                                    Logger.e(thA6, str4, new Object[0]);
                                }
                                geo0Var2 = geo0.b;
                                ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j2;
                                this.Y = (byte) 7;
                                if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                    return file2;
                                }
                                j3 = j2;
                                lQ = yah0.q(file.length());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 9;
                                gpj1Var2.getClass();
                                if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                    return file2;
                                }
                                ipj1Var = new ipj1(file.getAbsolutePath());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 10;
                                if (r261Var.b(ipj1Var, this) == file2) {
                                    return file2;
                                }
                                return m231Var;
                            }
                            return file2;
                        case 3:
                            gpj1 gpj1Var5 = this.a;
                            hm5.M(obj);
                            gpj1Var2 = gpj1Var5;
                            i2 = 2;
                            objA2 = obj;
                            oi31 oi31Var4 = (oi31) objA2;
                            muq0 muq0Var6 = new muq0();
                            ytw0 ytw0Var4 = jfv.b;
                            jH = jfv.h(fdg1.k0(1, ngv.e)) / 30;
                            if (file2.exists()) {
                                file2.delete();
                                break;
                            }
                            mediaCodecL = g931.l(muq0Var6);
                            surfaceCreateInputSurface = mediaCodecL.createInputSurface();
                            file = file2;
                            mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                            x550Var = new x550();
                            l811Var = new l811();
                            iac0 iac0Var4 = this.P0;
                            byte[] bArrB4 = oi31Var4.b();
                            Map mapC4 = oi31Var4.c();
                            Map mapA4 = oi31Var4.a();
                            List list4 = rl31Var.b;
                            Size size4 = muq0Var6.a;
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = muq0Var6;
                            this.d = mediaCodecL;
                            this.e = surfaceCreateInputSurface;
                            this.f = mediaMuxer;
                            this.g = x550Var;
                            this.h = l811Var;
                            this.t = jH;
                            this.Y = (byte) 4;
                            mediaCodec = mediaCodecL;
                            mediaMuxer2 = mediaMuxer;
                            file2 = file2;
                            str2 = "Failed to release encoder";
                            str3 = "Failed to release encoder surface";
                            muq0Var = muq0Var6;
                            objC = x550Var.c(iac0Var4, bArrB4, mapC4, mapA4, list4, size4, surfaceCreateInputSurface, this);
                            if (objC == file2) {
                                return file2;
                            }
                            x550Var2 = x550Var;
                            surface = surfaceCreateInputSurface;
                            gpj1Var3 = gpj1Var2;
                            mediaCodec2 = mediaCodec;
                            l811Var2 = l811Var;
                            mediaMuxer3 = mediaMuxer2;
                            fFloatValue = ((Number) objC).floatValue();
                            this.Z = r261Var;
                            this.a = gpj1Var3;
                            this.b = null;
                            this.c = muq0Var;
                            this.d = mediaCodec2;
                            this.e = surface;
                            this.f = mediaMuxer3;
                            this.g = x550Var2;
                            this.h = l811Var2;
                            this.t = jH;
                            this.X = fFloatValue;
                            this.Y = (byte) 5;
                            if (gpj1Var3.d(fFloatValue, this) == file2) {
                                return file2;
                            }
                            muq0Var2 = muq0Var;
                            f = fFloatValue;
                            l811Var3 = l811Var2;
                            mediaMuxer4 = mediaMuxer3;
                            x550Var2 = x550Var2;
                            j = jH;
                            muq0Var2.getClass();
                            i3 = (int) (30.0f * f);
                            if (i3 < 0) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            b = 17;
                            gpj1Var4 = gpj1Var3;
                            str4 = "Failed to release muxer";
                            mediaCodec3 = mediaCodec2;
                            zl31Var = new zl31(i4, j, mediaCodec3, mediaMuxer4, null, x550Var2, muq0Var2, r261Var, l811Var3, g931Var, gpj1Var4);
                            mediaMuxer4 = mediaMuxer4;
                            x550Var2 = x550Var2;
                            r261Var = r261Var;
                            gpj1Var3 = gpj1Var4;
                            this.Z = r261Var;
                            this.a = gpj1Var3;
                            this.b = null;
                            this.c = null;
                            this.d = mediaCodec3;
                            this.e = surface;
                            this.f = mediaMuxer4;
                            this.g = x550Var2;
                            this.h = null;
                            this.t = j;
                            this.X = f;
                            this.Y = (byte) 6;
                            if (gpj1Var3.b.g("video_encoding", zl31Var, this) == file2) {
                                return file2;
                            }
                            gpj1Var2 = gpj1Var3;
                            j2 = j;
                            mediaCodec4 = mediaCodec3;
                            surface.release();
                            m231VarP4 = m231Var;
                            thA4 = e331.a(m231VarP4);
                            if (thA4 != null) {
                                Logger.e(thA4, str3, new Object[0]);
                            }
                            mediaCodec4.release();
                            m231VarP5 = m231Var;
                            thA5 = e331.a(m231VarP5);
                            if (thA5 != null) {
                                Logger.e(thA5, str2, new Object[0]);
                            }
                            mediaMuxer4.release();
                            m231VarP6 = m231Var;
                            thA6 = e331.a(m231VarP6);
                            if (thA6 != null) {
                                Logger.e(thA6, str4, new Object[0]);
                            }
                            geo0Var2 = geo0.b;
                            ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.t = j2;
                            this.Y = (byte) 7;
                            if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                return file2;
                            }
                            j3 = j2;
                            lQ = yah0.q(file.length());
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.t = j3;
                            this.Y = (byte) 9;
                            gpj1Var2.getClass();
                            if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                return file2;
                            }
                            ipj1Var = new ipj1(file.getAbsolutePath());
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.t = j3;
                            this.Y = (byte) 10;
                            if (r261Var.b(ipj1Var, this) == file2) {
                                return file2;
                            }
                            return m231Var;
                        case 4:
                            long j4 = this.t;
                            l811 l811Var4 = this.h;
                            x550 x550Var3 = this.g;
                            MediaMuxer mediaMuxer5 = this.f;
                            surface = this.e;
                            MediaCodec mediaCodec5 = this.d;
                            muq0 muq0Var7 = this.c;
                            gpj1Var3 = this.a;
                            try {
                                hm5.M(obj);
                                objC = obj;
                                str2 = "Failed to release encoder";
                                str3 = "Failed to release encoder surface";
                                mediaMuxer3 = mediaMuxer5;
                                muq0Var = muq0Var7;
                                l811Var2 = l811Var4;
                                x550Var2 = x550Var3;
                                mediaCodec2 = mediaCodec5;
                                jH = j4;
                                file = file2;
                                file2 = file2;
                                fFloatValue = ((Number) objC).floatValue();
                                this.Z = r261Var;
                                this.a = gpj1Var3;
                                this.b = null;
                                this.c = muq0Var;
                                this.d = mediaCodec2;
                                this.e = surface;
                                this.f = mediaMuxer3;
                                this.g = x550Var2;
                                this.h = l811Var2;
                                this.t = jH;
                                this.X = fFloatValue;
                                this.Y = (byte) 5;
                                if (gpj1Var3.d(fFloatValue, this) == file2) {
                                    return file2;
                                }
                                muq0Var2 = muq0Var;
                                f = fFloatValue;
                                l811Var3 = l811Var2;
                                mediaMuxer4 = mediaMuxer3;
                                x550Var2 = x550Var2;
                                j = jH;
                                muq0Var2.getClass();
                                i3 = (int) (30.0f * f);
                                if (i3 < 0) {
                                    i4 = 0;
                                } else {
                                    i4 = i3;
                                }
                                b = 17;
                                gpj1Var4 = gpj1Var3;
                                str4 = "Failed to release muxer";
                                mediaCodec3 = mediaCodec2;
                                zl31Var = new zl31(i4, j, mediaCodec3, mediaMuxer4, null, x550Var2, muq0Var2, r261Var, l811Var3, g931Var, gpj1Var4);
                                mediaMuxer4 = mediaMuxer4;
                                x550Var2 = x550Var2;
                                r261Var = r261Var;
                                gpj1Var3 = gpj1Var4;
                                this.Z = r261Var;
                                this.a = gpj1Var3;
                                this.b = null;
                                this.c = null;
                                this.d = mediaCodec3;
                                this.e = surface;
                                this.f = mediaMuxer4;
                                this.g = x550Var2;
                                this.h = null;
                                this.t = j;
                                this.X = f;
                                this.Y = (byte) 6;
                                if (gpj1Var3.b.g("video_encoding", zl31Var, this) == file2) {
                                    return file2;
                                }
                                gpj1Var2 = gpj1Var3;
                                j2 = j;
                                mediaCodec4 = mediaCodec3;
                                surface.release();
                                m231VarP4 = m231Var;
                                thA4 = e331.a(m231VarP4);
                                if (thA4 != null) {
                                    Logger.e(thA4, str3, new Object[0]);
                                }
                                mediaCodec4.release();
                                m231VarP5 = m231Var;
                                thA5 = e331.a(m231VarP5);
                                if (thA5 != null) {
                                    Logger.e(thA5, str2, new Object[0]);
                                }
                                mediaMuxer4.release();
                                m231VarP6 = m231Var;
                                thA6 = e331.a(m231VarP6);
                                if (thA6 != null) {
                                    Logger.e(thA6, str4, new Object[0]);
                                }
                                geo0Var2 = geo0.b;
                                ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j2;
                                this.Y = (byte) 7;
                                if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                    return file2;
                                }
                                j3 = j2;
                                lQ = yah0.q(file.length());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 9;
                                gpj1Var2.getClass();
                                if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                    return file2;
                                }
                                ipj1Var = new ipj1(file.getAbsolutePath());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 10;
                                if (r261Var.b(ipj1Var, this) == file2) {
                                    return file2;
                                }
                                return m231Var;
                            } catch (Throwable th17) {
                                gpj1Var2 = gpj1Var3;
                                x550Var2 = x550Var3;
                                mediaMuxer2 = mediaMuxer5;
                                mediaCodec = mediaCodec5;
                                jH = j4;
                                b = 17;
                                th = th17;
                                surfaceCreateInputSurface = surface;
                                i = 2;
                                str = "Failed to release encoder";
                                surfaceCreateInputSurface.release();
                                m231VarP = m231Var;
                                thA = e331.a(m231VarP);
                                if (thA != null) {
                                    Logger.e(thA, str5, new Object[0]);
                                }
                                mediaCodec.release();
                                m231VarP2 = m231Var;
                                thA2 = e331.a(m231VarP2);
                                if (thA2 != null) {
                                    Logger.e(thA2, str, new Object[0]);
                                }
                                mediaMuxer2.release();
                                m231VarP3 = m231Var;
                                thA3 = e331.a(m231VarP3);
                                if (thA3 != null) {
                                    Logger.e(thA3, str4, new Object[0]);
                                }
                                geo0Var = geo0.b;
                                ic01Var = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.i = th;
                                this.t = jH;
                                this.Y = (byte) 8;
                                if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                    return file2;
                                }
                                th2 = th;
                                r2 = gpj1Var2;
                                throw th2;
                            }
                        case 5:
                            float f2 = this.X;
                            long j5 = this.t;
                            l811 l811Var5 = this.h;
                            x550 x550Var4 = this.g;
                            MediaMuxer mediaMuxer6 = this.f;
                            Surface surface2 = this.e;
                            mediaCodec2 = this.d;
                            muq0 muq0Var8 = this.c;
                            gpj1Var3 = this.a;
                            try {
                                hm5.M(obj);
                                str2 = "Failed to release encoder";
                                str3 = "Failed to release encoder surface";
                                l811Var3 = l811Var5;
                                x550Var2 = x550Var4;
                                mediaMuxer4 = mediaMuxer6;
                                surface = surface2;
                                f = f2;
                                muq0Var2 = muq0Var8;
                                j = j5;
                                g931Var = g931Var;
                                file = file2;
                                file2 = file2;
                                muq0Var2.getClass();
                                i3 = (int) (30.0f * f);
                                if (i3 < 0) {
                                    i4 = 0;
                                } else {
                                    i4 = i3;
                                }
                                b = 17;
                                gpj1Var4 = gpj1Var3;
                                str4 = "Failed to release muxer";
                                mediaCodec3 = mediaCodec2;
                                zl31Var = new zl31(i4, j, mediaCodec3, mediaMuxer4, null, x550Var2, muq0Var2, r261Var, l811Var3, g931Var, gpj1Var4);
                                mediaMuxer4 = mediaMuxer4;
                                x550Var2 = x550Var2;
                                r261Var = r261Var;
                                gpj1Var3 = gpj1Var4;
                                this.Z = r261Var;
                                this.a = gpj1Var3;
                                this.b = null;
                                this.c = null;
                                this.d = mediaCodec3;
                                this.e = surface;
                                this.f = mediaMuxer4;
                                this.g = x550Var2;
                                this.h = null;
                                this.t = j;
                                this.X = f;
                                this.Y = (byte) 6;
                                if (gpj1Var3.b.g("video_encoding", zl31Var, this) == file2) {
                                    return file2;
                                }
                                gpj1Var2 = gpj1Var3;
                                j2 = j;
                                mediaCodec4 = mediaCodec3;
                                surface.release();
                                m231VarP4 = m231Var;
                                thA4 = e331.a(m231VarP4);
                                if (thA4 != null) {
                                    Logger.e(thA4, str3, new Object[0]);
                                }
                                mediaCodec4.release();
                                m231VarP5 = m231Var;
                                thA5 = e331.a(m231VarP5);
                                if (thA5 != null) {
                                    Logger.e(thA5, str2, new Object[0]);
                                }
                                mediaMuxer4.release();
                                m231VarP6 = m231Var;
                                thA6 = e331.a(m231VarP6);
                                if (thA6 != null) {
                                    Logger.e(thA6, str4, new Object[0]);
                                }
                                geo0Var2 = geo0.b;
                                ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j2;
                                this.Y = (byte) 7;
                                if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                    return file2;
                                }
                                j3 = j2;
                                lQ = yah0.q(file.length());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 9;
                                gpj1Var2.getClass();
                                if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                    return file2;
                                }
                                ipj1Var = new ipj1(file.getAbsolutePath());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 10;
                                if (r261Var.b(ipj1Var, this) == file2) {
                                    return file2;
                                }
                                return m231Var;
                            } catch (Throwable th18) {
                                th = th18;
                                str = "Failed to release encoder";
                                mediaCodec = mediaCodec2;
                                file2 = file2;
                                x550Var2 = x550Var4;
                                mediaMuxer2 = mediaMuxer6;
                                surfaceCreateInputSurface = surface2;
                                jH = j5;
                                b = 17;
                                gpj1Var2 = gpj1Var3;
                                str5 = "Failed to release encoder surface";
                                i = 2;
                                th = th;
                                surfaceCreateInputSurface.release();
                                m231VarP = m231Var;
                                thA = e331.a(m231VarP);
                                if (thA != null) {
                                    Logger.e(thA, str5, new Object[0]);
                                }
                                mediaCodec.release();
                                m231VarP2 = m231Var;
                                thA2 = e331.a(m231VarP2);
                                if (thA2 != null) {
                                    Logger.e(thA2, str, new Object[0]);
                                }
                                mediaMuxer2.release();
                                m231VarP3 = m231Var;
                                thA3 = e331.a(m231VarP3);
                                if (thA3 != null) {
                                    Logger.e(thA3, str4, new Object[0]);
                                }
                                geo0Var = geo0.b;
                                ic01Var = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.i = th;
                                this.t = jH;
                                this.Y = (byte) 8;
                                if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                    return file2;
                                }
                                th2 = th;
                                r2 = gpj1Var2;
                                throw th2;
                            }
                        case 6:
                            long j6 = this.t;
                            x550Var2 = this.g;
                            mediaMuxer4 = this.f;
                            surface = this.e;
                            mediaCodec4 = this.d;
                            gpj1Var2 = this.a;
                            try {
                                hm5.M(obj);
                                str2 = "Failed to release encoder";
                                str3 = "Failed to release encoder surface";
                                file = file2;
                                j2 = j6;
                                file2 = file2;
                                str4 = "Failed to release muxer";
                                b = 17;
                                surface.release();
                                m231VarP4 = m231Var;
                                thA4 = e331.a(m231VarP4);
                                if (thA4 != null) {
                                    Logger.e(thA4, str3, new Object[0]);
                                }
                                mediaCodec4.release();
                                m231VarP5 = m231Var;
                                thA5 = e331.a(m231VarP5);
                                if (thA5 != null) {
                                    Logger.e(thA5, str2, new Object[0]);
                                }
                                mediaMuxer4.release();
                                m231VarP6 = m231Var;
                                thA6 = e331.a(m231VarP6);
                                if (thA6 != null) {
                                    Logger.e(thA6, str4, new Object[0]);
                                }
                                geo0Var2 = geo0.b;
                                ic01Var2 = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j2;
                                this.Y = (byte) 7;
                                if (fn31.Y(geo0Var2, ic01Var2, this) == file2) {
                                    return file2;
                                }
                                j3 = j2;
                                lQ = yah0.q(file.length());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 9;
                                gpj1Var2.getClass();
                                if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                    return file2;
                                }
                                ipj1Var = new ipj1(file.getAbsolutePath());
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.t = j3;
                                this.Y = (byte) 10;
                                if (r261Var.b(ipj1Var, this) == file2) {
                                    return file2;
                                }
                                return m231Var;
                            } catch (Throwable th19) {
                                mediaMuxer2 = mediaMuxer4;
                                mediaCodec = mediaCodec4;
                                i = 2;
                                jH = j6;
                                surfaceCreateInputSurface = surface;
                                b = 17;
                                th = th19;
                                str = "Failed to release encoder";
                                surfaceCreateInputSurface.release();
                                m231VarP = m231Var;
                                thA = e331.a(m231VarP);
                                if (thA != null) {
                                    Logger.e(thA, str5, new Object[0]);
                                }
                                mediaCodec.release();
                                m231VarP2 = m231Var;
                                thA2 = e331.a(m231VarP2);
                                if (thA2 != null) {
                                    Logger.e(thA2, str, new Object[0]);
                                }
                                mediaMuxer2.release();
                                m231VarP3 = m231Var;
                                thA3 = e331.a(m231VarP3);
                                if (thA3 != null) {
                                    Logger.e(thA3, str4, new Object[0]);
                                }
                                geo0Var = geo0.b;
                                ic01Var = new ic01(x550Var2, (lnm) null, b);
                                this.Z = r261Var;
                                this.a = gpj1Var2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.i = th;
                                this.t = jH;
                                this.Y = (byte) 8;
                                if (fn31.Y(geo0Var, ic01Var, this) == file2) {
                                    return file2;
                                }
                                th2 = th;
                                r2 = gpj1Var2;
                                throw th2;
                            }
                        case 7:
                            j3 = this.t;
                            gpj1 gpj1Var6 = this.a;
                            hm5.M(obj);
                            gpj1Var2 = gpj1Var6;
                            file = file2;
                            file2 = file2;
                            lQ = yah0.q(file.length());
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.t = j3;
                            this.Y = (byte) 9;
                            gpj1Var2.getClass();
                            if (fn31.Y(geo0.b, new tv1(gpj1Var2, 1, lQ, (lnm) null), this) == file2) {
                                return file2;
                            }
                            ipj1Var = new ipj1(file.getAbsolutePath());
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.t = j3;
                            this.Y = (byte) 10;
                            if (r261Var.b(ipj1Var, this) == file2) {
                                return file2;
                            }
                            return m231Var;
                        case 8:
                            th2 = this.i;
                            gpj1 gpj1Var7 = this.a;
                            hm5.M(obj);
                            file2 = file2;
                            i = 2;
                            r2 = gpj1Var7;
                            throw th2;
                        case 9:
                            j3 = this.t;
                            gpj1 gpj1Var8 = this.a;
                            hm5.M(obj);
                            gpj1Var2 = gpj1Var8;
                            file = file2;
                            file2 = file2;
                            ipj1Var = new ipj1(file.getAbsolutePath());
                            this.Z = r261Var;
                            this.a = gpj1Var2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.t = j3;
                            this.Y = (byte) 10;
                            if (r261Var.b(ipj1Var, this) == file2) {
                                return file2;
                            }
                            return m231Var;
                        case 10:
                            gpj1 gpj1Var9 = this.a;
                            hm5.M(obj);
                            return m231Var;
                        case 11:
                            CancellationException cancellationException = (CancellationException) this.b;
                            hm5.M(obj);
                            throw cancellationException;
                        case 12:
                            e = this.b;
                            hm5.M(obj);
                            file2 = file2;
                            r9 = 0;
                            Logger.e(e, "Video generation failed", new Object[0]);
                            jpj1Var = new jpj1(e);
                            this.Z = r9;
                            this.a = r9;
                            this.b = r9;
                            this.Y = (byte) 13;
                            if (r261Var.b(jpj1Var, this) == file2) {
                                return file2;
                            }
                            return m231Var;
                        case 13:
                            hm5.M(obj);
                            return m231Var;
                        default:
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (CancellationException e17) {
                    e = e17;
                }
            } catch (CancellationException e18) {
                e = e18;
                r4 = r5;
                r1 = r4;
                r8 = 0;
                r3 = r1;
                this.Z = r8;
                this.a = r8;
                this.b = e;
                this.c = r8;
                this.d = r8;
                this.e = r8;
                this.f = r8;
                this.g = r8;
                this.h = r8;
                this.i = r8;
                this.Y = (byte) 11;
                r3.getClass();
                if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                    return file2;
                }
                throw e;
            } catch (Exception e19) {
                e = e19;
                r4 = r5;
                file2 = file2;
                r2 = r4;
                i = 2;
                this.Z = r261Var;
                r9 = 0;
                this.a = null;
                this.b = e;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.Y = (byte) 12;
                r2.getClass();
                if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                    return file2;
                }
                Logger.e(e, "Video generation failed", new Object[0]);
                jpj1Var = new jpj1(e);
                this.Z = r9;
                this.a = r9;
                this.b = r9;
                this.Y = (byte) 13;
                if (r261Var.b(jpj1Var, this) == file2) {
                    return file2;
                }
                return m231Var;
            }
        } catch (CancellationException e20) {
            e = e20;
            r1 = r4;
            r8 = 0;
            r3 = r1;
            this.Z = r8;
            this.a = r8;
            this.b = e;
            this.c = r8;
            this.d = r8;
            this.e = r8;
            this.f = r8;
            this.g = r8;
            this.h = r8;
            this.i = r8;
            this.Y = (byte) 11;
            r3.getClass();
            if (fn31.Y(geo0.b, new tv1((gpj1) r3, 3, (Long) r8, (lnm) r8), this) == file2) {
                return file2;
            }
            throw e;
        } catch (Exception e21) {
            e = e21;
            file2 = file2;
            r2 = r4;
            i = 2;
            this.Z = r261Var;
            r9 = 0;
            this.a = null;
            this.b = e;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.Y = (byte) 12;
            r2.getClass();
            if (fn31.Y(geo0.b, new tv1((gpj1) r2, i, (Long) null, (lnm) null), this) == file2) {
                return file2;
            }
            Logger.e(e, "Video generation failed", new Object[0]);
            jpj1Var = new jpj1(e);
            this.Z = r9;
            this.a = r9;
            this.b = r9;
            this.Y = (byte) 13;
            if (r261Var.b(jpj1Var, this) == file2) {
                return file2;
            }
            return m231Var;
        }
    }
}
