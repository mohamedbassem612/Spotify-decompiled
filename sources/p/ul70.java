package p;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ul70 extends lap1 {
    public static final Pattern e = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder c = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder d = StandardCharsets.ISO_8859_1.newDecoder();

    public final hjj0 i(gkj0 gkj0Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.d;
        CharsetDecoder charsetDecoder2 = this.c;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new hjj0(new wl70(null, null, bArr));
        }
        Matcher matcher = e.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strW = eth.W(strGroup);
                strW.getClass();
                if (strW.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strW.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new hjj0(new wl70(str, str2, bArr));
    }
}
