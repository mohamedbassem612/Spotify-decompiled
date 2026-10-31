package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class op extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wfx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op(wfx wfxVar, byte b) {
        super(4);
        this.a = b;
        this.b = wfxVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wfx wfxVar = this.b;
        switch (b) {
            case 0:
                mp mpVar = (mp) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | (x340Var.g(mpVar) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(wfxVar.a), apo.r(348313302, new n2(mpVar, iu30Var, (byte) 2), x340Var2), x340Var2, 56);
                }
                break;
            case 1:
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                mod.b(oi7.a.a(wfxVar.a), apo.r(1154096644, new ozw((if3) obj, (iu30) obj2, (byte) 8), b0kVar), b0kVar, 56);
                break;
            case 2:
                zih zihVar = (zih) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var3.g(zihVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    mod.b(oi7.a.a(wfxVar.a), apo.r(-1801055504, new ozw(zihVar, iu30Var2, (byte) 9), x340Var4), x340Var4, 56);
                }
                break;
            case 3:
                gg21 gg21Var = (gg21) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                int i3 = (iIntValue3 & 6) == 0 ? iIntValue3 | ((iIntValue3 & 8) == 0 ? x340Var5.g(gg21Var) : x340Var5.i(gg21Var) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i3 |= x340Var5.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var6.b0();
                } else {
                    mod.b(oi7.a.a(wfxVar.a), apo.r(218484587, new ozw(gg21Var, iu30Var3, (byte) 10), x340Var6), x340Var6, 56);
                }
                break;
            case 4:
                cs11 cs11Var = (cs11) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var7.g(cs11Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= x340Var7.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    x340Var8.b0();
                } else {
                    mod.b(oi7.a.a(wfxVar.a), apo.r(314560403, new zt11(cs11Var, iu30Var4, (byte) 0), x340Var8), x340Var8, 56);
                }
                break;
            default:
                cs11 cs11Var2 = (cs11) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                int i5 = (iIntValue5 & 6) == 0 ? iIntValue5 | (x340Var9.g(cs11Var2) ? 4 : 2) : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i5 |= x340Var9.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    x340Var10.b0();
                } else {
                    mod.b(oi7.a.a(wfxVar.a), apo.r(-1823009796, new zt11(cs11Var2, iu30Var5, (byte) 1), x340Var10), x340Var10, 56);
                }
                break;
        }
        return rih1Var;
    }
}
