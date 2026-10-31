package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
    public final d a;
    public final Locale b;
    public final ResolverStyle c;
    public final Chronology d;
    public final ZoneId e;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        c0 c0Var = c0.EXCEEDS_PAD;
        dateTimeFormatterBuilder.o(chronoField, 4, 10, c0Var);
        dateTimeFormatterBuilder.d('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.n(chronoField2, 2);
        dateTimeFormatterBuilder.d('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        dateTimeFormatterBuilder.n(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        DateTimeFormatter dateTimeFormatterR = dateTimeFormatterBuilder.r(resolverStyle, isoChronology);
        ISO_LOCAL_DATE = dateTimeFormatterR;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        q qVar = q.INSENSITIVE;
        dateTimeFormatterBuilder2.c(qVar);
        dateTimeFormatterBuilder2.a(dateTimeFormatterR);
        k kVar = k.e;
        dateTimeFormatterBuilder2.c(kVar);
        dateTimeFormatterBuilder2.r(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.c(qVar);
        dateTimeFormatterBuilder3.a(dateTimeFormatterR);
        dateTimeFormatterBuilder3.q();
        dateTimeFormatterBuilder3.c(kVar);
        dateTimeFormatterBuilder3.r(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.n(chronoField4, 2);
        dateTimeFormatterBuilder4.d(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.n(chronoField5, 2);
        dateTimeFormatterBuilder4.q();
        dateTimeFormatterBuilder4.d(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.n(chronoField6, 2);
        dateTimeFormatterBuilder4.q();
        dateTimeFormatterBuilder4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterR2 = dateTimeFormatterBuilder4.r(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.c(qVar);
        dateTimeFormatterBuilder5.a(dateTimeFormatterR2);
        dateTimeFormatterBuilder5.c(kVar);
        dateTimeFormatterBuilder5.r(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.c(qVar);
        dateTimeFormatterBuilder6.a(dateTimeFormatterR2);
        dateTimeFormatterBuilder6.q();
        dateTimeFormatterBuilder6.c(kVar);
        dateTimeFormatterBuilder6.r(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.c(qVar);
        dateTimeFormatterBuilder7.a(dateTimeFormatterR);
        dateTimeFormatterBuilder7.d('T');
        dateTimeFormatterBuilder7.a(dateTimeFormatterR2);
        DateTimeFormatter dateTimeFormatterR3 = dateTimeFormatterBuilder7.r(resolverStyle, isoChronology);
        ISO_LOCAL_DATE_TIME = dateTimeFormatterR3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.c(qVar);
        dateTimeFormatterBuilder8.a(dateTimeFormatterR3);
        q qVar2 = q.LENIENT;
        dateTimeFormatterBuilder8.c(qVar2);
        dateTimeFormatterBuilder8.c(kVar);
        q qVar3 = q.STRICT;
        dateTimeFormatterBuilder8.c(qVar3);
        DateTimeFormatter dateTimeFormatterR4 = dateTimeFormatterBuilder8.r(resolverStyle, isoChronology);
        ISO_OFFSET_DATE_TIME = dateTimeFormatterR4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(dateTimeFormatterR4);
        dateTimeFormatterBuilder9.q();
        dateTimeFormatterBuilder9.d('[');
        q qVar4 = q.SENSITIVE;
        dateTimeFormatterBuilder9.c(qVar4);
        j$.time.d dVar = DateTimeFormatterBuilder.h;
        dateTimeFormatterBuilder9.c(new t(dVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder9.d(']');
        dateTimeFormatterBuilder9.r(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(dateTimeFormatterR3);
        dateTimeFormatterBuilder10.q();
        dateTimeFormatterBuilder10.c(kVar);
        dateTimeFormatterBuilder10.q();
        dateTimeFormatterBuilder10.d('[');
        dateTimeFormatterBuilder10.c(qVar4);
        dateTimeFormatterBuilder10.c(new t(dVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder10.d(']');
        ISO_DATE_TIME = dateTimeFormatterBuilder10.r(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.c(qVar);
        dateTimeFormatterBuilder11.o(chronoField, 4, 10, c0Var);
        dateTimeFormatterBuilder11.d('-');
        dateTimeFormatterBuilder11.n(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.q();
        dateTimeFormatterBuilder11.c(kVar);
        dateTimeFormatterBuilder11.r(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.c(qVar);
        dateTimeFormatterBuilder12.o(j$.time.temporal.h.c, 4, 10, c0Var);
        dateTimeFormatterBuilder12.e("-W");
        dateTimeFormatterBuilder12.n(j$.time.temporal.h.b, 2);
        dateTimeFormatterBuilder12.d('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.n(chronoField7, 1);
        dateTimeFormatterBuilder12.q();
        dateTimeFormatterBuilder12.c(kVar);
        dateTimeFormatterBuilder12.r(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.c(qVar);
        dateTimeFormatterBuilder13.c(new g());
        ISO_INSTANT = dateTimeFormatterBuilder13.r(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.c(qVar);
        dateTimeFormatterBuilder14.n(chronoField, 4);
        dateTimeFormatterBuilder14.n(chronoField2, 2);
        dateTimeFormatterBuilder14.n(chronoField3, 2);
        dateTimeFormatterBuilder14.q();
        dateTimeFormatterBuilder14.c(qVar2);
        dateTimeFormatterBuilder14.h("+HHMMss", "Z");
        dateTimeFormatterBuilder14.c(qVar3);
        dateTimeFormatterBuilder14.r(resolverStyle, isoChronology);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.c(qVar);
        dateTimeFormatterBuilder15.c(qVar2);
        dateTimeFormatterBuilder15.q();
        dateTimeFormatterBuilder15.j(chronoField7, map);
        dateTimeFormatterBuilder15.e(", ");
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.o(chronoField3, 1, 2, c0.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.j(chronoField2, map2);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.n(chronoField, 4);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.n(chronoField4, 2);
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.n(chronoField5, 2);
        dateTimeFormatterBuilder15.q();
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.n(chronoField6, 2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.h("+HHMM", "GMT");
        dateTimeFormatterBuilder15.r(ResolverStyle.SMART, isoChronology);
    }

    public DateTimeFormatter(d dVar, Locale locale, ResolverStyle resolverStyle, Chronology chronology, ZoneId zoneId) {
        int i = a0.a;
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        this.c = resolverStyle;
        this.d = chronology;
        this.e = zoneId;
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f(formatStyle, null);
        return dateTimeFormatterBuilder.r(ResolverStyle.SMART, IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle, FormatStyle formatStyle2) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        Objects.requireNonNull(formatStyle2, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f(formatStyle, formatStyle2);
        return dateTimeFormatterBuilder.r(ResolverStyle.SMART, IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f(null, formatStyle);
        return dateTimeFormatterBuilder.r(ResolverStyle.SMART, IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(str);
        return dateTimeFormatterBuilder.s(Locale.getDefault(), ResolverStyle.SMART, null);
    }

    public final Object a(CharSequence charSequence, j$.time.d dVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        try {
            return b(charSequence).d(dVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0308  */
    /* JADX WARN: Code duplicated, block: B:129:0x0316  */
    /* JADX WARN: Code duplicated, block: B:130:0x0341  */
    /* JADX WARN: Code duplicated, block: B:163:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0254  */
    /* JADX WARN: Code duplicated, block: B:96:0x0278  */
    public final b0 b(CharSequence charSequence) {
        TemporalField temporalField;
        ChronoField chronoField;
        ChronoField chronoField2;
        boolean zContainsKey;
        Map map;
        Period period;
        Period period2;
        TemporalField temporalField2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        v vVar = new v(this);
        int iX = this.a.x(vVar, charSequence, parsePosition.getIndex());
        if (iX < 0) {
            parsePosition.setErrorIndex(~iX);
            vVar = null;
        } else {
            parsePosition.setIndex(iX);
        }
        if (vVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        b0 b0VarC = vVar.c();
        b0VarC.c = vVar.d();
        ZoneId zoneId = b0VarC.b;
        if (zoneId == null) {
            zoneId = vVar.a.e;
        }
        b0VarC.b = zoneId;
        b0VarC.e = this.c;
        b0VarC.n();
        b0VarC.t(b0VarC.c.M(b0VarC.a, b0VarC.e));
        b0VarC.q();
        if (((HashMap) b0VarC.a).size() > 0) {
            loop0: while (i < 50) {
                Iterator it = ((HashMap) b0VarC.a).entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    temporalField2 = (TemporalField) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorD = temporalField2.D(b0VarC.a, b0VarC, b0VarC.e);
                    if (temporalAccessorD != null) {
                        if (temporalAccessorD instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorD;
                            ZoneId zoneId2 = b0VarC.b;
                            if (zoneId2 == null) {
                                b0VarC.b = chronoZonedDateTime.getZone();
                            } else if (!zoneId2.equals(chronoZonedDateTime.getZone())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + b0VarC.b);
                            }
                            temporalAccessorD = chronoZonedDateTime.toLocalDateTime();
                        }
                        if (temporalAccessorD instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorD;
                            b0VarC.s(chronoLocalDateTime.toLocalTime(), Period.d);
                            b0VarC.t(chronoLocalDateTime.toLocalDate());
                            break;
                        }
                        if (temporalAccessorD instanceof ChronoLocalDate) {
                            b0VarC.t((ChronoLocalDate) temporalAccessorD);
                            break;
                        }
                        if (temporalAccessorD instanceof LocalTime) {
                            b0VarC.s((LocalTime) temporalAccessorD, Period.d);
                            break;
                        }
                        j$.nio.file.r.h("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        return null;
                    }
                } while (((HashMap) b0VarC.a).containsKey(temporalField2));
                i++;
            }
            if (i == 50) {
                j$.nio.file.r.h("One of the parsed fields has an incorrectly implemented resolve method");
                return null;
            }
            if (i > 0) {
                b0VarC.n();
                b0VarC.t(b0VarC.c.M(b0VarC.a, b0VarC.e));
                b0VarC.q();
            }
        }
        long j = 1000000;
        if (b0VarC.g == null) {
            Map map2 = b0VarC.a;
            ChronoField chronoField3 = ChronoField.MILLI_OF_SECOND;
            boolean zContainsKey2 = ((HashMap) map2).containsKey(chronoField3);
            Map map3 = b0VarC.a;
            if (zContainsKey2) {
                long jLongValue = ((Long) ((HashMap) map3).remove(chronoField3)).longValue();
                Map map4 = b0VarC.a;
                ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                boolean zContainsKey3 = ((HashMap) map4).containsKey(chronoField4);
                Map map5 = b0VarC.a;
                if (zContainsKey3) {
                    long jLongValue2 = (((Long) ((HashMap) map5).get(chronoField4)).longValue() % 1000) + (jLongValue * 1000);
                    b0VarC.u(chronoField3, chronoField4, Long.valueOf(jLongValue2));
                    ((HashMap) b0VarC.a).remove(chronoField4);
                    ((HashMap) b0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    ((HashMap) map5).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                ChronoField chronoField5 = ChronoField.MICRO_OF_SECOND;
                if (((HashMap) map3).containsKey(chronoField5)) {
                    ((HashMap) b0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) b0VarC.a).remove(chronoField5)).longValue() * 1000));
                }
            }
            Map map6 = b0VarC.a;
            ChronoField chronoField6 = ChronoField.HOUR_OF_DAY;
            Long l = (Long) ((HashMap) map6).get(chronoField6);
            if (l != null) {
                Map map7 = b0VarC.a;
                ChronoField chronoField7 = ChronoField.MINUTE_OF_HOUR;
                Long l2 = (Long) ((HashMap) map7).get(chronoField7);
                Map map8 = b0VarC.a;
                ChronoField chronoField8 = ChronoField.SECOND_OF_MINUTE;
                Long l3 = (Long) ((HashMap) map8).get(chronoField8);
                Map map9 = b0VarC.a;
                ChronoField chronoField9 = ChronoField.NANO_OF_SECOND;
                Long l4 = (Long) ((HashMap) map9).get(chronoField9);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    b0VarC.p(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    ((HashMap) b0VarC.a).remove(chronoField6);
                    ((HashMap) b0VarC.a).remove(chronoField7);
                    ((HashMap) b0VarC.a).remove(chronoField8);
                    ((HashMap) b0VarC.a).remove(chronoField9);
                } else {
                    j = 1000000;
                }
            }
            if (b0VarC.e != ResolverStyle.LENIENT && ((HashMap) b0VarC.a).size() > 0) {
                for (Map.Entry entry : ((HashMap) b0VarC.a).entrySet()) {
                    temporalField = (TemporalField) entry.getKey();
                    if (temporalField instanceof ChronoField) {
                        chronoField = (ChronoField) temporalField;
                        if (chronoField.Q()) {
                            chronoField.P(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
        } else if (b0VarC.e != ResolverStyle.LENIENT) {
            while (r0.hasNext()) {
                temporalField = (TemporalField) entry.getKey();
                if (temporalField instanceof ChronoField) {
                    chronoField = (ChronoField) temporalField;
                    if (chronoField.Q()) {
                        chronoField.P(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = b0VarC.f;
        if (chronoLocalDate != null) {
            b0VarC.m(chronoLocalDate);
        }
        LocalTime localTime = b0VarC.g;
        if (localTime != null) {
            b0VarC.m(localTime);
            if (b0VarC.f != null && ((HashMap) b0VarC.a).size() > 0) {
                b0VarC.m(b0VarC.f.F(b0VarC.g));
            }
        }
        ChronoLocalDate chronoLocalDate2 = b0VarC.f;
        if (chronoLocalDate2 != null && b0VarC.g != null && (period = b0VarC.h) != (period2 = Period.d)) {
            b0VarC.f = chronoLocalDate2.L(period);
            b0VarC.h = period2;
        }
        if (b0VarC.g == null) {
            if (((HashMap) b0VarC.a).containsKey(ChronoField.INSTANT_SECONDS)) {
                Map map10 = b0VarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map10).containsKey(chronoField2);
                map = b0VarC.a;
                if (zContainsKey) {
                    long jLongValue3 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) b0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                    ((HashMap) b0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) b0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) b0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) b0VarC.a).containsKey(ChronoField.SECOND_OF_DAY)) {
                Map map11 = b0VarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map11).containsKey(chronoField2);
                map = b0VarC.a;
                if (zContainsKey) {
                    long jLongValue4 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) b0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                    ((HashMap) b0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) b0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) b0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) b0VarC.a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                Map map12 = b0VarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map12).containsKey(chronoField2);
                map = b0VarC.a;
                if (zContainsKey) {
                    long jLongValue5 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) b0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                    ((HashMap) b0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) b0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) b0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
        }
        if (b0VarC.f != null && b0VarC.g != null) {
            Long l5 = (Long) ((HashMap) b0VarC.a).get(ChronoField.OFFSET_SECONDS);
            if (l5 != null) {
                ((HashMap) b0VarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(b0VarC.f.F(b0VarC.g).C(ZoneOffset.ofTotalSeconds(l5.intValue())).toEpochSecond()));
                return b0VarC;
            }
            if (b0VarC.b != null) {
                ((HashMap) b0VarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(b0VarC.f.F(b0VarC.g).C(b0VarC.b).toEpochSecond()));
            }
        }
        return b0VarC;
    }

    public final d c() {
        d dVar = this.a;
        return !dVar.b ? dVar : new d(dVar.a, false);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.p(new w(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.b.equals(locale)) {
            return this;
        }
        int i = a0.a;
        return new DateTimeFormatter(this.a, locale, this.c, this.d, this.e);
    }

    public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        if (Objects.equals(this.c, resolverStyle)) {
            return this;
        }
        Locale locale = this.b;
        int i = a0.a;
        return new DateTimeFormatter(this.a, locale, resolverStyle, this.d, this.e);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.e, zoneId)) {
            return this;
        }
        Locale locale = this.b;
        int i = a0.a;
        return new DateTimeFormatter(this.a, locale, this.c, this.d, zoneId);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(str);
        return dateTimeFormatterBuilder.s(locale, ResolverStyle.SMART, null);
    }
}
