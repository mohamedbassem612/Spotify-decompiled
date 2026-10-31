package p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class y520 extends mno1 {
    public static boolean E(File file) {
        n520 n520Var = new n520(new p520(file));
        while (true) {
            boolean z = true;
            while (n520Var.hasNext()) {
                File file2 = (File) n520Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String F(File file) {
        return ihc1.V0(file.getName(), '.', "");
    }

    public static byte[] G(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    rt00 rt00Var = new rt00(8193);
                    rt00Var.write(i5);
                    o0c.w(fileInputStream, rt00Var);
                    int size = rt00Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = rt00Var.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrA, 0, bArrCopyOf, i, rt00Var.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String H(File file) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), nne.a);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            inputStreamReader.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static File I(File file, String str) {
        int iV0;
        File file2 = new File(str);
        String path = file2.getPath();
        char c = File.separatorChar;
        int length = 0;
        int iV1 = ihc1.v0(path, c, 0, 4);
        if (iV1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iV0 = ihc1.v0(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iV2 = ihc1.v0(path, c, iV0 + 1, 4);
                length = iV2 >= 0 ? iV2 + 1 : path.length();
            }
        } else if (iV1 > 0 && path.charAt(iV1 - 1) == ':') {
            length = iV1 + 1;
        } else if (iV1 == -1 && ihc1.n0(path, ':')) {
            length = path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        if (string.length() == 0 || ihc1.n0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static void J(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void K(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                eg.m("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
