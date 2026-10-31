package p;

import com.spotify.kidsentitybanning.banning.v1.BanForSelfRequest;
import com.spotify.kidsentitybanning.banning.v1.ChildBanStatus;
import com.spotify.kidsentitybanning.banning.v1.UpdateBanStatusRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xj21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zj21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj21(zj21 zj21Var, byte b) {
        super(0);
        this.a = b;
        this.b = zj21Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        zj21 zj21Var = this.b;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 0:
                ik21 ik21Var = zj21Var.X1;
                if (ik21Var == null) {
                    u890.C("callbacks");
                    throw null;
                }
                va40 va40Var = (va40) ik21Var.d.d;
                vku vkuVar = ik21Var.i;
                int iB = ik21Var.b();
                if (iB != 0) {
                    dsk0 dsk0Var = ik21Var.k;
                    if (dsk0Var != null) {
                        i8h1 i8h1Var = ik21Var.a;
                        x6h1 x6h1VarC = dsk0Var.b.c();
                        x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        String str = ik21Var.j;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("block_content", 1, Collections.singletonMap("item_to_be_blocked", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    gk21 gk21Var = ik21Var.h;
                    if (gk21Var != null) {
                        boolean z = gk21Var instanceof fk21;
                        fq21 fq21Var = fq21.a;
                        if (z) {
                            String str2 = ik21Var.j;
                            List list = ((fk21) gk21Var).a;
                            int iS = zno1.s(q7h.U(list, 10));
                            if (iS < 16) {
                                iS = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                            for (Object obj : list) {
                                linkedHashMap.put(obj, Boolean.TRUE);
                            }
                            va40Var.getClass();
                            goh1 goh1VarO = UpdateBanStatusRequest.o();
                            goh1VarO.r(str2);
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                d0g d0gVarN = ChildBanStatus.n();
                                d0gVarN.r((String) entry.getKey());
                                d0gVarN.q(((Boolean) entry.getValue()).booleanValue());
                                goh1VarO.n(d0gVarN.build());
                            }
                            vkuVar.a(va40Var.a.d((UpdateBanStatusRequest) goh1VarO.build(), fq21Var).subscribe(new n68(ik21Var, iB, (byte) 2), new hk21(ik21Var, b3)));
                        } else if (gk21Var instanceof dk21) {
                            String str3 = ik21Var.j;
                            oa40 oa40Var = va40Var.a;
                            b4a b4aVarN = BanForSelfRequest.n();
                            b4aVarN.n(str3);
                            vkuVar.a(oa40Var.j((BanForSelfRequest) b4aVarN.build(), fq21Var).subscribe(new afe(ik21Var, iB, gk21Var, (byte) 4), new hk21(ik21Var, b2)));
                        } else if (!gk21Var.equals(ek21.a)) {
                            eg.o();
                            return null;
                        }
                    }
                }
                zj21Var.Z0(false, false);
                return rih1Var;
            default:
                ik21 ik21Var2 = zj21Var.X1;
                if (ik21Var2 == null) {
                    u890.C("callbacks");
                    throw null;
                }
                dsk0 dsk0Var2 = ik21Var2.k;
                if (dsk0Var2 != null) {
                    i8h1 i8h1Var2 = ik21Var2.a;
                    x6h1 x6h1VarC2 = dsk0Var2.b.c();
                    x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                ik21Var2.i.c();
                ik21Var2.h = null;
                zj21Var.Z0(false, false);
                return rih1Var;
        }
    }
}
