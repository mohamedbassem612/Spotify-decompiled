package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class r implements e {
    public final TemporalField a;
    public final TextStyle b;
    public final z c;
    public volatile j d;

    public r(TemporalField temporalField, TextStyle textStyle, z zVar) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean p(w wVar, StringBuilder sb) {
        Long lA = wVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = wVar.b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) wVar.a.d(j$.time.temporal.m.b);
        String strC = (chronology == null || chronology == IsoChronology.INSTANCE) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(chronology, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, c0.NORMAL);
        }
        return this.d.p(wVar, sb);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        TemporalField temporalField = this.a;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }

    @Override // j$.time.format.e
    public final int x(v vVar, CharSequence charSequence, int i) {
        z zVar = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        TextStyle textStyle = z ? this.b : null;
        Chronology chronologyD = vVar.d();
        Iterator itE = (chronologyD == null || chronologyD == IsoChronology.INSTANCE) ? zVar.e(temporalField, textStyle, dateTimeFormatter.b) : zVar.d(chronologyD, temporalField, textStyle, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (vVar.h(str, 0, charSequence, i, str.length())) {
                    return vVar.g(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (temporalField == ChronoField.ERA && !vVar.c) {
                for (j$.time.chrono.j jVar : chronologyD.eras()) {
                    String string = jVar.toString();
                    if (vVar.h(string, 0, charSequence, i, string.length())) {
                        return vVar.g(this.a, jVar.getValue(), i, string.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, c0.NORMAL);
        }
        return this.d.x(vVar, charSequence, i);
    }
}
