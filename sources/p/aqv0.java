package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aqv0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bqv0 b;

    public /* synthetic */ aqv0(bqv0 bqv0Var, byte b) {
        this.a = b;
        this.b = bqv0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = false;
        bqv0 bqv0Var = this.b;
        switch (b) {
            case 0:
                spq0 spq0Var = (spq0) obj;
                l1a l1aVar = spq0Var.c() ? (l1a) spq0Var.b() : null;
                f2a f2aVar = bqv0Var.d;
                if (l1aVar != null) {
                    boolean zH = f2aVar.a.a.h(m2a.d, false);
                    String str = l1aVar.a;
                    String str2 = l1aVar.b;
                    if (!zH && str != null && str2 != null) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
                        String str3 = simpleDateFormat.format(new Date(twb.i()));
                        try {
                            Date date = simpleDateFormat.parse(str);
                            Date date2 = simpleDateFormat.parse(str2);
                            Date date3 = simpleDateFormat.parse(str3);
                            if (date != null && date2 != null && date3 != null && date3.getTime() >= date.getTime() && date3.getTime() <= date2.getTime()) {
                                z = true;
                            }
                        } catch (ParseException e) {
                            e.getMessage();
                        }
                    }
                }
                jkp0 jkp0Var = bqv0Var.h;
                if (jkp0Var != null) {
                    ((ssw0) jkp0Var.b).l(Boolean.valueOf(z));
                }
                break;
            case 1:
                bqv0Var.a((Throwable) obj);
                break;
            case 2:
                l1a l1aVar2 = (l1a) obj;
                m2a m2aVar = bqv0Var.c;
                l1aVar2.getClass();
                dma1 dma1Var = m2aVar.a;
                try {
                    l1a l1aVarA = m2aVar.a();
                    if (l1aVarA == null || !l1aVarA.equals(l1aVar2)) {
                        hma1 hma1VarEdit = dma1Var.edit();
                        hma1VarEdit.a(m2a.d, false);
                        hma1VarEdit.g();
                        String strB = m2aVar.b.b(l1a.Companion.serializer(), l1aVar2);
                        hma1 hma1VarEdit2 = dma1Var.edit();
                        hma1VarEdit2.d(m2a.c, strB);
                        hma1VarEdit2.g();
                    }
                } catch (SerializationException e2) {
                    e2.getMessage();
                } catch (IOException e3) {
                    e3.getMessage();
                }
                m2a m2aVar2 = bqv0Var.d.a;
                long jI = twb.i();
                hma1 hma1VarEdit3 = m2aVar2.a.edit();
                hma1VarEdit3.c(m2a.e, jI);
                hma1VarEdit3.g();
                break;
            default:
                m2a m2aVar3 = bqv0Var.d.a;
                long jI2 = twb.i();
                hma1 hma1VarEdit4 = m2aVar3.a.edit();
                hma1VarEdit4.c(m2a.f, jI2);
                hma1VarEdit4.g();
                bqv0Var.a((Throwable) obj);
                break;
        }
    }
}
