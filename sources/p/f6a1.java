package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.tap.go.protocol.GoProtocolParseException;
import com.spotify.tap.go.socket.SocketIo;
import io.reactivex.rxjava3.core.Observable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f6a1 {
    public final InputStream a;
    public final qy40 b;
    public final yfu c;
    public final String d;

    public f6a1(InputStream inputStream, qy40 qy40Var, yfu yfuVar, String str) {
        this.a = inputStream;
        this.b = qy40Var;
        this.c = yfuVar;
        this.d = str;
    }

    public final hkt0 a(byte[] bArr) throws GoProtocolParseException {
        byte b;
        int i;
        byte[] bArrCopyOfRange;
        z6x z6xVar;
        boolean zEquals = Arrays.equals(bArr, qy40.c);
        String str = this.d;
        if (zEquals) {
            return new hkt0("microsoft-surface-buds-legacy-client-id", "Surface Buds", "Microsoft", str);
        }
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ((gkt0) it.next()).getClass();
            if (bArr.length != 0 && (b = bArr[0]) == 1) {
                if (bArr.length == 0 || b != 1) {
                    throw new GoProtocolParseException(bArr, 4);
                }
                if (bArr.length < 2) {
                    bArrCopyOfRange = new byte[0];
                } else {
                    byte b2 = bArr[1];
                    if (b2 == 0) {
                        bArrCopyOfRange = new byte[0];
                    } else {
                        if (b2 <= 0 || bArr.length < (i = b2 + 2)) {
                            throw new GoProtocolParseException(bArr, 2);
                        }
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, 2, i);
                    }
                }
                if (bArrCopyOfRange.length == 0) {
                    z6xVar = z6x.a;
                } else {
                    z6x arrayList = new ArrayList(3);
                    StringBuilder sb = new StringBuilder(bArrCopyOfRange.length);
                    for (byte b3 : bArrCopyOfRange) {
                        if (b3 == 0) {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        } else {
                            sb.append((char) (b3 & 65535));
                        }
                    }
                    if (sb.length() > 0) {
                        throw new GoProtocolParseException(bArr, 3);
                    }
                    z6xVar = arrayList;
                }
                if (z6xVar.size() == 3) {
                    return new hkt0((String) z6xVar.get(0), (String) z6xVar.get(1), (String) z6xVar.get(2), str);
                }
                throw new GoProtocolParseException(bArr, 5);
            }
        }
        throw new GoProtocolParseException(bArr, 1);
    }

    public final Observable b() {
        return Observable.create(new q881(this, (byte) 8));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.tap.go.socket.SocketIo$CommandParseException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.tap.go.socket.SocketIo$CommandReadException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.tap.go.socket.SocketIo$ConnectionException */
    public final hkt0 c() throws SocketIo.CommandParseException, SocketIo.CommandReadException, SocketIo.ConnectionException {
        yfu yfuVar = this.c;
        try {
            Logger.g("Go: Do blocking read of bytes", new Object[0]);
            byte[] bArr = new byte[257];
            int i = this.a.read(bArr, 0, 257);
            Logger.g("Go: Bytes received", new Object[0]);
            if (i <= 0) {
                throw new SocketIo.CommandReadException();
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            hkt0 hkt0VarA = a(bArr2);
            String string = UUID.randomUUID().toString();
            String str = hkt0VarA.a;
            String str2 = hkt0VarA.b;
            String str3 = hkt0VarA.c;
            String str4 = hkt0VarA.d;
            hkt0 hkt0Var = new hkt0(str, str2, str3, str4, string);
            yfu.p(yfuVar, string, str, str3, str2, str4, "RECEIVED", (String) null, (String) null, 192);
            return hkt0Var;
        } catch (GoProtocolParseException e) {
            String string2 = UUID.randomUUID().toString();
            String str5 = this.d;
            yfu.p(yfuVar, string2, (String) null, (String) null, (String) null, str5, "RECEIVED", (String) null, (String) null, 192);
            yfu.p(yfuVar, string2, (String) null, (String) null, (String) null, str5, "ERROR", "PARSE_ERROR", (String) null, 128);
            yfuVar.m(e.a, 1);
            throw new SocketIo.CommandParseException("Error parsing bytes to command", e);
        } catch (IOException e2) {
            throw new SocketIo.ConnectionException("IO Exception. Socket likely closed", e2);
        }
    }
}
