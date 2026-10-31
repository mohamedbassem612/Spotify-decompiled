package com.fasterxml.jackson.databind.ser.std;

import java.sql.Date;
import java.text.DateFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    public SqlDateSerializer() {
        this(null, null);
    }
}
