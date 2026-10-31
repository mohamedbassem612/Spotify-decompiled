package p;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l911 {
    public final dma1 a;
    public final yqg b;
    public final bma1 c;
    public final bma1 d;
    public final bma1 e;

    public l911(int i, dma1 dma1Var, yqg yqgVar) {
        String str;
        this.a = dma1Var;
        this.b = yqgVar;
        nbc nbcVar = bma1.b;
        if (i == 1) {
            str = "referrals_settings_item";
        } else if (i == 2) {
            str = "referrals_your_premium_cta";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "referrals_your_premium_section";
        }
        this.c = nbcVar.n(str.concat("_first_impression_timestamp"));
        this.d = nbcVar.n(str.concat("_impression_count"));
        this.e = nbcVar.n(str.concat("_interacted"));
    }

    public final LocalDate a() {
        dma1 dma1Var = (ima1) this.a;
        bma1 bma1Var = this.c;
        if (!dma1Var.n(bma1Var)) {
            dma1Var = null;
        }
        if (dma1Var != null) {
            return LocalDate.ofEpochDay(dma1Var.g(bma1Var, 0L));
        }
        return null;
    }

    public final boolean b() {
        dma1 dma1Var = this.a;
        if (!dma1Var.h(this.e, false) && dma1Var.l(this.d, 0) < 3) {
            if (a() == null) {
                return true;
            }
            LocalDate localDateA = a();
            if ((localDateA != null ? localDateA.until(Instant.ofEpochMilli(this.b.b()).atZone(ZoneId.of("UTC")).toLocalDate(), ChronoUnit.DAYS) : 0L) <= 30) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (b()) {
            dma1 dma1Var = this.a;
            bma1 bma1Var = this.d;
            int iL = dma1Var.l(bma1Var, 0) + 1;
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.b(bma1Var, iL);
            hma1VarEdit.g();
            if (a() == null) {
                LocalDate localDate = Instant.ofEpochMilli(this.b.b()).atZone(ZoneId.of("UTC")).toLocalDate();
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.c(this.c, localDate.toEpochDay());
                hma1VarEdit2.g();
            }
        }
    }
}
