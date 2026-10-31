package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class m implements TemporalAccessor {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public m(n nVar, Path path, BasicFileAttributes basicFileAttributes, IOException iOException) {
        this.b = nVar;
        this.c = path;
        this.d = basicFileAttributes;
        this.e = iOException;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object d(j$.time.d dVar) {
        if (dVar == j$.time.temporal.m.b) {
            return (Chronology) this.d;
        }
        if (dVar == j$.time.temporal.m.a) {
            return (ZoneId) this.e;
        }
        return dVar == j$.time.temporal.m.c ? ((TemporalAccessor) this.c).d(dVar) : dVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.b;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? ((TemporalAccessor) this.c).h(temporalField) : chronoLocalDate.h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long j(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.b;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? ((TemporalAccessor) this.c).j(temporalField) : chronoLocalDate.j(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public j$.time.temporal.o k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.b;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? ((TemporalAccessor) this.c).k(temporalField) : chronoLocalDate.k(temporalField);
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                TemporalAccessor temporalAccessor = (TemporalAccessor) this.c;
                Chronology chronology = (Chronology) this.d;
                String str2 = "";
                if (chronology != null) {
                    str = " with chronology " + chronology;
                } else {
                    str = "";
                }
                ZoneId zoneId = (ZoneId) this.e;
                if (zoneId != null) {
                    str2 = " with zone " + zoneId;
                }
                return temporalAccessor + str + str2;
            default:
                return super.toString();
        }
    }

    public m(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.b = chronoLocalDate;
        this.c = temporalAccessor;
        this.d = chronology;
        this.e = zoneId;
    }
}
