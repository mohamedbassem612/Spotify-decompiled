package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u8r extends f311 {
    public final iec a;

    public u8r(iec iecVar) {
        this.a = iecVar;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1458785216);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1041) != 1040)) {
            don1.i(this.a, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, rk41Var.a, true, (qim0) null, (djc0) null, x340Var, 3128, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, i2cVar, rk41Var, function0, (byte) 2);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return nk41.a;
    }
}
