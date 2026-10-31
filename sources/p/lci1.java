package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lci1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mci1 a;

    public lci1(mci1 mci1Var) {
        this.a = mci1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00dc A[PHI: r11
      0x00dc: PHI (r11v2 int) = (r11v1 int), (r11v4 int) binds: [B:15:0x00cf, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kci1 kci1Var;
        int i;
        if (onmVar instanceof kci1) {
            kci1Var = (kci1) onmVar;
            int i2 = kci1Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kci1Var.b = i2 - Integer.MIN_VALUE;
            } else {
                kci1Var = new kci1(this, onmVar);
            }
        } else {
            kci1Var = new kci1(this, onmVar);
        }
        Object obj2 = kci1Var.a;
        int i3 = kci1Var.b;
        if (i3 == 0) {
            hm5.M(obj2);
            aci1 aci1Var = (aci1) obj;
            e821 e821Var = this.a.a;
            int i4 = aci1Var.a;
            int i5 = aci1Var.b;
            int i6 = aci1Var.c;
            String str = aci1Var.d;
            String str2 = aci1Var.e;
            edi1 edi1Var = (edi1) e821Var.d;
            i8h1 i8h1VarA = edi1Var.a();
            x6h1 x6h1VarC = edi1Var.b.b.c();
            x6h1VarC.i.add(new a7h1("birthday_input_group", (String) null, (Integer) null, (String) null, (String) null));
            int i7 = 0;
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("birthday_input_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1VarA.m(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "birthday")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            Calendar calendarD = ((yqg) e821Var.e).d();
            nwa nwaVar = (nwa) e821Var.a;
            calendarD.getClass();
            String strB = nwaVar.b(calendarD, i6, i5, i4);
            int iC = l1d.C(nwaVar.c(strB, str, str2));
            if (iC != 0) {
                i7 = 2;
                if (iC == 1) {
                    i = i7;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
            } else {
                i = i7;
            }
            pci1 pci1Var = new pci1(i4, i5, i6, i, String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5 + 1), Integer.valueOf(i6)}, 3)), strB);
            kci1Var.b = 1;
            Object objB = r261Var.b(pci1Var, kci1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
