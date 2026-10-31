package j$.time.format;

import j$.time.temporal.WeekFields;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class s extends j {
    public final char g;
    public final int h;

    public s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, c0.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new s(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final j f(Locale locale) {
        j$.time.temporal.p pVar;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c = this.g;
        if (c == 'W') {
            pVar = weekFieldsOf.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.p pVar2 = weekFieldsOf.f;
                int i = this.h;
                if (i == 2) {
                    return new p(pVar2, 2, 2, p.h, this.e);
                }
                return new j(pVar2, i, 19, i < 4 ? c0.NORMAL : c0.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                pVar = weekFieldsOf.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                pVar = weekFieldsOf.e;
            }
        }
        return new j(pVar, this.b, this.c, c0.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean p(w wVar, StringBuilder sb) {
        return f(wVar.b.b).p(wVar, sb);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? c0.NORMAL : c0.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final int x(v vVar, CharSequence charSequence, int i) {
        return f(vVar.a.b).x(vVar, charSequence, i);
    }
}
