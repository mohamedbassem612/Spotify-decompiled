package p;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l19 {
    public final long a;

    public l19(long j) {
        this.a = j;
    }

    public static l19 a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        l19 l19Var = new l19(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return l19Var;
                    }
                    l19 l19Var2 = new l19(jsonReader.nextLong());
                    jsonReader.close();
                    return l19Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof l19) && this.a == ((l19) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return pze0.h(this.a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
