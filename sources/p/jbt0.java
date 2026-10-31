package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class jbt0 implements Update {
    public final Next a(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        lbt0 lbt0Var = (lbt0) obj;
        ebt0 ebt0Var = (ebt0) obj2;
        Map map = lbt0Var.c;
        if (ebt0Var.equals(nat0.a)) {
            c10 c10Var = (c10) map.get(t80.d);
            if (c10Var == null || (str7 = c10Var.e) == null) {
                str7 = "";
            }
            return str7.equals("") ? Next.j() : Next.a(Collections.singleton(new q9t0(str7)));
        }
        if (ebt0Var.equals(lat0.a)) {
            c10 c10Var2 = (c10) map.get(t80.a);
            if (c10Var2 == null || (str6 = c10Var2.e) == null) {
                str6 = "";
            }
            return str6.equals("") ? Next.j() : Next.a(Collections.singleton(new o9t0(str6)));
        }
        if (ebt0Var.equals(sat0.a)) {
            c10 c10Var3 = (c10) map.get(t80.c);
            if (c10Var3 == null || (str5 = c10Var3.e) == null) {
                str5 = "";
            }
            return str5.equals("") ? Next.j() : Next.a(Collections.singleton(new s9t0(str5)));
        }
        if (ebt0Var.equals(qat0.a)) {
            String str8 = nik1.O1.a;
            return u890.j(str8, "") ? Next.j() : Next.a(Collections.singleton(new s9t0(str8)));
        }
        if (ebt0Var instanceof cbt0) {
            String str9 = ((cbt0) ebt0Var).a;
            return (str9 == null || str9.length() == 0) ? Next.j() : Next.a(Collections.singleton(new m9t0(str9)));
        }
        if (ebt0Var.equals(mat0.a)) {
            c10 c10Var4 = (c10) map.get(t80.h);
            if (c10Var4 == null || (str4 = c10Var4.e) == null) {
                str4 = "";
            }
            return str4.equals("") ? Next.j() : Next.a(Collections.singleton(new p9t0(str4)));
        }
        if (ebt0Var.equals(pat0.a)) {
            c10 c10Var5 = (c10) map.get(t80.i);
            if (c10Var5 == null || (str3 = c10Var5.e) == null) {
                str3 = "";
            }
            return str3.equals("") ? Next.j() : Next.a(Collections.singleton(new r9t0(str3)));
        }
        if (ebt0Var.equals(dbt0.a)) {
            return Next.a(Collections.singleton(bat0.a));
        }
        if (ebt0Var instanceof hat0) {
            int i = ((hat0) ebt0Var).a;
            String str10 = ((xe1) lbt0Var.f.get(i)).e;
            return str10.equals("") ? Next.j() : Next.a(Collections.singleton(new t9t0(i, str10)));
        }
        if (ebt0Var instanceof kat0) {
            int i2 = ((kat0) ebt0Var).a;
            String str11 = ((gja) lbt0Var.a.c.get(i2)).f;
            return str11.equals("") ? Next.j() : Next.a(Collections.singleton(new n9t0(i2, str11)));
        }
        if (ebt0Var instanceof bbt0) {
            String str12 = ((bbt0) ebt0Var).a;
            return str12.equals("") ? Next.j() : Next.a(Collections.singleton(new aat0(str12)));
        }
        if (ebt0Var instanceof wat0) {
            wat0 wat0Var = (wat0) ebt0Var;
            String str13 = wat0Var.a;
            return str13 == null ? Next.j() : Next.a(Collections.singleton(new y9t0(str13, wat0Var.b)));
        }
        if (ebt0Var instanceof tat0) {
            String str14 = ((tat0) ebt0Var).a;
            return u890.j(str14, "") ? Next.j() : Next.a(Collections.singleton(new v9t0(str14)));
        }
        if (ebt0Var instanceof iat0) {
            String str15 = ((iat0) ebt0Var).a;
            return str15.equals("") ? Next.j() : Next.a(Collections.singleton(new k9t0(str15)));
        }
        if (ebt0Var instanceof zat0) {
            return Next.i(lbt0.a(lbt0Var, false, true, 1663), Collections.singleton(eat0.a));
        }
        if (ebt0Var instanceof abt0) {
            String str16 = ((abt0) ebt0Var).a;
            return str16.equals("") ? Next.j() : Next.a(Collections.singleton(new z9t0(str16)));
        }
        if (ebt0Var.equals(rat0.a)) {
            return Next.i(lbt0.a(lbt0Var, true, false, 1919), Collections.singleton(dat0.a));
        }
        if (ebt0Var.equals(oat0.a)) {
            return Next.h(lbt0.a(lbt0Var, false, false, 1663));
        }
        if (ebt0Var instanceof jat0) {
            c10 c10Var6 = (c10) map.get(t80.t);
            if (c10Var6 == null || (str2 = c10Var6.e) == null) {
                str2 = "";
            }
            return str2.equals("") ? Next.j() : Next.a(Collections.singleton(new l9t0(str2)));
        }
        if (ebt0Var.equals(uat0.a)) {
            kvm0 kvm0Var = lbt0Var.j;
            if (kvm0Var == null || (str = kvm0Var.c.e) == null) {
                str = "";
            }
            return str.equals("") ? Next.j() : Next.a(Collections.singleton(new w9t0(str)));
        }
        if (ebt0Var instanceof vat0) {
            vat0 vat0Var = (vat0) ebt0Var;
            String str17 = vat0Var.a;
            return str17.equals("") ? Next.j() : Next.a(Collections.singleton(new x9t0(str17, vat0Var.b)));
        }
        if (ebt0Var.equals(gat0.a)) {
            return Next.a(Collections.singleton(new cat0(lbt0Var.i)));
        }
        if (ebt0Var instanceof yat0) {
            return Next.h(((yat0) ebt0Var).a);
        }
        if (ebt0Var.equals(xat0.a)) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
