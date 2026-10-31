package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class da5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da5(long j, fc5 fc5Var, long j2) {
        super(1);
        this.a = (byte) 8;
        this.b = j;
        this.d = fc5Var;
        this.c = j2;
    }

    public final Object invoke(Object obj) {
        tw4 tw4VarA;
        String identifier;
        t2k1 configuration;
        byte b = this.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        long j2 = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                eqc eqcVar = (eqc) obj;
                return eqcVar.a(new ca5((l4g) obj2, eqcVar.h() * 1.0f, this.b, this.c));
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                DrawScope.d0(drawScope, this.b, 0L, drawScope.j(), 0.0f, (phc1) null, (ColorFilter) null, 122);
                DrawScope.d0(drawScope, this.c, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat * ((bix0) obj2).b)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), 0.0f, (phc1) null, (ColorFilter) null, 122);
                return rih1Var;
            case 2:
                ((ven0) obj2).setValue(new u7h(z4p1.A(((Number) ((o95) obj).e()).floatValue(), j, j2)));
                return rih1Var;
            case 3:
                eqc eqcVar2 = (eqc) obj;
                jtq0 jtq0VarA = ((cr31) obj2).a(eqcVar2.a.j(), eqcVar2.a.getLayoutDirection(), eqcVar2);
                if (jtq0VarA instanceof jtq0) {
                    tw4VarA = ww4.a();
                    tw4VarA.e(jtq0VarA.c, 1);
                } else {
                    tw4VarA = null;
                }
                return eqcVar2.a(new lff(tw4VarA, this.c, v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(this.b, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(this.b, 1.0f, 0.0f, 0.0f, 0.0f, 14)))}, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) / 2.0f)) & 4294967295L), Math.max(Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)), Float.intBitsToFloat((int) (4294967295L & eqcVar2.a.j()))), 8), (byte) 5));
            case 4:
                sp21 sp21Var = (sp21) obj;
                sp21Var.c = ((ln21) obj2).a.i;
                sp21Var.i = Long.valueOf(j);
                sp21Var.n = Long.valueOf(j2);
                return rih1Var;
            case 5:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, Integer.valueOf(((ev7) obj2).a), (List) null, (String) null, (jgc1) null, 0, false, false, 32633);
            case 6:
                k5u0 k5u0Var = (k5u0) obj;
                Boolean bool = (Boolean) obj2;
                return k5u0.b(k5u0Var, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, bool != null ? bool.booleanValue() : k5u0Var.n, false, 24553);
            case 7:
                k5u0 k5u0Var2 = (k5u0) obj;
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj2;
                if (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null || (identifier = configuration.getIdentifier()) == null) {
                    identifier = "unknown";
                }
                return k5u0.b(k5u0Var2, this.b, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, identifier, (jgc1) null, 0, false, false, 32249);
            default:
                ((fc5) obj2).a.t(yoi1.o(((((Number) obj).longValue() - j) / 1000000.0f) / j2, 0.0f, 1.0f));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da5(long j, long j2, bix0 bix0Var) {
        super(1);
        this.a = (byte) 1;
        this.b = j;
        this.c = j2;
        this.d = bix0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da5(Object obj, long j, long j2, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da5(q5u0 q5u0Var, VideoSurfaceView videoSurfaceView, long j, long j2) {
        super(1);
        this.a = (byte) 7;
        this.d = videoSurfaceView;
        this.b = j;
        this.c = j2;
    }
}
