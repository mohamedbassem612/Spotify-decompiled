package p;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.Date;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ee31 implements nma0 {
    public static final ee31 a = new ee31();
    public static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneOffset.UTC);
    public static final qnw0 c = omo1.c("Date", knw0.o);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(dar darVar) throws SerializationException {
        String strV = darVar.V();
        try {
            return new Date(OffsetDateTime.parse(strV, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toInstant().toEpochMilli());
        } catch (DateTimeException e) {
            throw new SerializationException(l1d.m("Invalid RFC 3339 date: ", strV), e);
        }
    }

    public final h661 getDescriptor() {
        return c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0(b.format(Instant.ofEpochMilli(((Date) obj).getTime())));
    }
}
