package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.time.d h = new j$.time.d((byte) 4);
    public static final Map i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat timeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            j$.nio.file.r.a("Either dateStyle or timeStyle must be non-null");
            return null;
        }
        if (formatStyle2 == null) {
            timeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else {
            timeInstance = formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (!(timeInstance instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can't determine pattern from " + timeInstance);
        }
        String pattern = ((SimpleDateFormat) timeInstance).toPattern();
        if (pattern == null) {
            return null;
        }
        int i2 = 0;
        boolean z = pattern.indexOf(66) != -1;
        boolean z2 = pattern.indexOf(98) != -1;
        if (!z && !z2) {
            return pattern;
        }
        StringBuilder sb = new StringBuilder(pattern.length());
        char c = ' ';
        while (i2 < pattern.length()) {
            char cCharAt = pattern.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i2 == 0 || (c != 'B' && c != 'b')) {
                sb.append(cCharAt);
            }
            i2++;
            c = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.c());
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(chronoField, i2, i3, z));
        } else {
            l(new f(chronoField, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            l lVar = new l(eVar, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            eVar = lVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.c).add(eVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        dateTimeFormatterBuilder2.g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.c).size() - 1;
    }

    public final void d(char c) {
        c(new c(c));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        byte b = 1;
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(b, str));
        }
    }

    public final void f(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            j$.nio.file.r.a("Either the date or time style must be non-null");
        } else {
            c(new i(formatStyle, formatStyle2));
        }
    }

    public final void g(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            c(new h((byte) 0, textStyle));
        } else {
            j$.nio.file.r.a("Style must be either full or short");
        }
    }

    public final void h(String str, String str2) {
        c(new k(str, str2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0183  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:249:0x0365  */
    /* JADX WARN: Code duplicated, block: B:251:0x036f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0373  */
    /* JADX WARN: Code duplicated, block: B:284:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x037e A[SYNTHETIC] */
    public final void i(String str) {
        String strSubstring;
        boolean z;
        int i2;
        int i3;
        Objects.requireNonNull(str, "pattern");
        int i4 = 0;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i5 = i4 + 1;
                while (i5 < str.length() && str.charAt(i5) == cCharAt) {
                    i5++;
                }
                int i6 = i5 - i4;
                if (cCharAt == 'p') {
                    if (i5 >= str.length() || (((cCharAt = str.charAt(i5)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i2 = i5;
                        i3 = i6;
                        i6 = 0;
                    } else {
                        i2 = i5 + 1;
                        while (i2 < str.length() && str.charAt(i2) == cCharAt) {
                            i2++;
                        }
                        i3 = i2 - i5;
                    }
                    if (i6 == 0) {
                        j$.nio.file.r.a("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                        return;
                    }
                    if (i6 < 1) {
                        j$.nio.file.r.m("The pad width must be at least one but was ", i6);
                        return;
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
                    dateTimeFormatterBuilder.e = i6;
                    dateTimeFormatterBuilder.f = ' ';
                    dateTimeFormatterBuilder.g = -1;
                    i6 = i3;
                    i5 = i2;
                }
                TemporalField temporalField = (TemporalField) ((HashMap) i).get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    if (cCharAt == 'A') {
                        o(temporalField, i6, 19, c0.NOT_NEGATIVE);
                    } else {
                        if (cCharAt == 'Q') {
                            z = false;
                        } else if (cCharAt == 'S') {
                            b(ChronoField.NANO_OF_SECOND, i6, i6, false);
                        } else if (cCharAt == 'a') {
                            if (i6 != 1) {
                                j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            k(temporalField, TextStyle.SHORT);
                        } else if (cCharAt == 'k') {
                            if (i6 == 1) {
                                m(temporalField);
                            } else {
                                if (i6 == 2) {
                                    j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                    return;
                                }
                                n(temporalField, i6);
                            }
                        } else if (cCharAt == 'q') {
                            z = true;
                        } else if (cCharAt == 's') {
                            if (i6 == 1) {
                                m(temporalField);
                            } else {
                                if (i6 == 2) {
                                    j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                    return;
                                }
                                n(temporalField, i6);
                            }
                        } else if (cCharAt == 'u' || cCharAt == 'y') {
                            if (i6 == 2) {
                                LocalDate localDate = p.h;
                                Objects.requireNonNull(localDate, "baseDate");
                                l(new p(temporalField, 2, 2, localDate, 0));
                            } else if (i6 < 4) {
                                o(temporalField, i6, 19, c0.NORMAL);
                            } else {
                                o(temporalField, i6, 19, c0.EXCEEDS_PAD);
                            }
                        } else if (cCharAt == 'g') {
                            o(temporalField, i6, 19, c0.NORMAL);
                        } else if (cCharAt == 'h' || cCharAt == 'm') {
                            if (i6 == 1) {
                                m(temporalField);
                            } else {
                                if (i6 == 2) {
                                    j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                    return;
                                }
                                n(temporalField, i6);
                            }
                        } else if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    if (i6 == 1) {
                                        m(temporalField);
                                    } else {
                                        if (i6 != 2 && i6 != 3) {
                                            j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                            return;
                                        }
                                        o(temporalField, i6, 3, c0.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z = false;
                                    break;
                                case 'F':
                                    if (i6 != 1) {
                                        j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                        return;
                                    }
                                    m(temporalField);
                                    break;
                                case 'G':
                                    if (i6 == 1 || i6 == 2 || i6 == 3) {
                                        k(temporalField, TextStyle.SHORT);
                                    } else if (i6 == 4) {
                                        k(temporalField, TextStyle.FULL);
                                    } else {
                                        if (i6 != 5) {
                                            j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                            return;
                                        }
                                        k(temporalField, TextStyle.NARROW);
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z = true;
                                            break;
                                        case 'M':
                                            z = false;
                                            break;
                                        case 'N':
                                            o(temporalField, i6, 19, c0.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i6 == 1) {
                                                        int i7 = i6;
                                                        l(new s(cCharAt, i7, i7, i7, 0));
                                                    } else {
                                                        if (i6 == 2) {
                                                            j$.nio.file.r.a("Invalid pattern \"cc\"");
                                                            return;
                                                        }
                                                        z = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    z = false;
                                                    break;
                                                default:
                                                    if (i6 != 1) {
                                                        n(temporalField, i6);
                                                    } else {
                                                        m(temporalField);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i6 == 1) {
                                        m(temporalField);
                                    } else {
                                        if (i6 == 2) {
                                            j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                            return;
                                        }
                                        n(temporalField, i6);
                                    }
                                    break;
                            }
                        } else {
                            o(temporalField, i6, 19, c0.NOT_NEGATIVE);
                        }
                        if (i6 == 1 || i6 == 2) {
                            if (cCharAt == 'e') {
                                int i8 = i6;
                                l(new s(cCharAt, i8, i8, i8, 0));
                            } else if (cCharAt == 'E') {
                                k(temporalField, TextStyle.SHORT);
                            } else if (i6 == 1) {
                                m(temporalField);
                            } else {
                                n(temporalField, 2);
                            }
                        } else if (i6 == 3) {
                            k(temporalField, z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i6 == 4) {
                            k(temporalField, z ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i6 != 5) {
                                j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            k(temporalField, z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    }
                } else if (cCharAt == 'z') {
                    if (i6 > 4) {
                        j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                        return;
                    } else if (i6 == 4) {
                        c(new u(TextStyle.FULL, false));
                    } else {
                        c(new u(TextStyle.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i6 != 2) {
                        j$.nio.file.r.i("Pattern letter count must be 2: ", cCharAt);
                        return;
                    }
                    c(new t(j$.time.temporal.m.a, "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i6 < 4) {
                            h("+HHMM", "+0000");
                        } else if (i6 == 4) {
                            g(TextStyle.FULL);
                        } else {
                            if (i6 != 5) {
                                j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            h("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i6 == 1) {
                            g(TextStyle.SHORT);
                        } else {
                            if (i6 != 4) {
                                j$.nio.file.r.i("Pattern letter count must be 1 or 4: ", cCharAt);
                                return;
                            }
                            g(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i6 > 5) {
                            j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                            return;
                        }
                        h(k.d[i6 + (i6 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i6 > 5) {
                            j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                            return;
                        }
                        if (i6 == 1) {
                            str2 = "+00";
                        } else if (i6 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        h(k.d[i6 + (i6 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt != 'W') {
                        int i9 = i6;
                        if (cCharAt == 'w') {
                            if (i9 > 2) {
                                j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            l(new s(cCharAt, i9, i9, 2, 0));
                        } else if (cCharAt != 'Y') {
                            j$.nio.file.r.i("Unknown pattern letter: ", cCharAt);
                            return;
                        } else if (i9 == 2) {
                            l(new s(cCharAt, i9, i9, 2, 0));
                        } else {
                            l(new s(cCharAt, i9, i9, 19, 0));
                        }
                    } else if (i6 > 1) {
                        j$.nio.file.r.i("Too many pattern letters: ", cCharAt);
                        return;
                    } else {
                        int i10 = i6;
                        l(new s(cCharAt, i10, i10, i10, 0));
                    }
                } else if (i6 == 1) {
                    c(new u(TextStyle.SHORT, true));
                } else {
                    if (i6 != 4) {
                        j$.nio.file.r.i("Wrong number of  pattern letters: ", cCharAt);
                        return;
                    }
                    c(new u(TextStyle.FULL, true));
                }
                i4 = i5 - 1;
            } else if (cCharAt == '\'') {
                int i11 = i4 + 1;
                int i12 = i11;
                while (i12 < str.length()) {
                    if (str.charAt(i12) == '\'') {
                        int i13 = i12 + 1;
                        if (i13 < str.length() && str.charAt(i13) == '\'') {
                            i12 = i13;
                        } else {
                            if (i12 < str.length()) {
                                j$.nio.file.r.a("Pattern ends with an incomplete string literal: ".concat(str));
                                return;
                            }
                            strSubstring = str.substring(i11, i12);
                            if (strSubstring.isEmpty()) {
                                d('\'');
                            } else {
                                e(strSubstring.replace("''", "'"));
                            }
                            i4 = i12;
                        }
                    }
                    i12++;
                }
                if (i12 < str.length()) {
                    j$.nio.file.r.a("Pattern ends with an incomplete string literal: ".concat(str));
                    return;
                }
                strSubstring = str.substring(i11, i12);
                if (strSubstring.isEmpty()) {
                    d('\'');
                } else {
                    e(strSubstring.replace("''", "'"));
                }
                i4 = i12;
            } else if (cCharAt == '[') {
                q();
            } else if (cCharAt == ']') {
                if (this.a.b == null) {
                    j$.nio.file.r.a("Pattern invalid as it contains ] without previous [");
                    return;
                }
                p();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                d(cCharAt);
            }
            i4++;
        }
    }

    public final void j(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new r(chronoField, textStyle, new a(new y(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void k(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new r(temporalField, textStyle, z.c));
    }

    public final void l(j jVar) {
        j jVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = c(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) dateTimeFormatterBuilder.c).get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == c0.NOT_NEGATIVE) {
            jVarD = jVar2.e(i4);
            c(jVar.d());
            this.a.g = i2;
        } else {
            jVarD = jVar2.d();
            this.a.g = c(jVar);
        }
        ((ArrayList) this.a.c).set(i2, jVarD);
    }

    public final void m(TemporalField temporalField) {
        l(new j(temporalField, 1, 19, c0.NORMAL));
    }

    public final void n(TemporalField temporalField, int i2) {
        Objects.requireNonNull(temporalField, "field");
        if (i2 < 1 || i2 > 19) {
            j$.nio.file.r.m("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            l(new j(temporalField, i2, i2, c0.NOT_NEGATIVE));
        }
    }

    public final void o(TemporalField temporalField, int i2, int i3, c0 c0Var) {
        if (i2 == i3 && c0Var == c0.NOT_NEGATIVE) {
            n(temporalField, i3);
            return;
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(c0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.nio.file.r.m("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.nio.file.r.m("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            l(new j(temporalField, i2, i3, c0Var));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void p() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = ((ArrayList) dateTimeFormatterBuilder.c).size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        if (size <= 0) {
            this.a = dateTimeFormatterBuilder2.b;
            return;
        }
        d dVar = new d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void q() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter r(ResolverStyle resolverStyle, IsoChronology isoChronology) {
        return s(Locale.getDefault(), resolverStyle, isoChronology);
    }

    public final DateTimeFormatter s(Locale locale, ResolverStyle resolverStyle, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            p();
        }
        d dVar = new d(this.c, false);
        int i2 = a0.a;
        return new DateTimeFormatter(dVar, locale, resolverStyle, chronology, null);
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }
}
