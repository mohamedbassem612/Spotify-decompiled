package p;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vch1 extends jaa {
    public boolean X;
    public int Y;
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress t;

    public vch1() {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p.o2r
    public final void close() {
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.t;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.t = null;
        this.Y = 0;
        if (this.X) {
            this.X = false;
            i();
        }
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.g;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    public final int read(byte[] bArr, int i, int i2) throws DataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.Y;
        DatagramPacket datagramPacket = this.f;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.Y = length;
                c(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.Y;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.e, length2 - i4, bArr, i, iMin);
        this.Y -= iMin;
        return iMin;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws DataSourceException {
        DatagramSocket datagramSocket;
        Uri uri = n3rVar.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        l(n3rVar);
        try {
            this.t = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.t, port);
            if (this.t.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.t);
                datagramSocket = this.i;
                this.h = datagramSocket;
            } else {
                DatagramSocket datagramSocket2 = new DatagramSocket(inetSocketAddress);
                this.h = datagramSocket2;
                datagramSocket = datagramSocket2;
            }
            datagramSocket.setSoTimeout(8000);
            this.X = true;
            m(n3rVar);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(e2, 2006);
        }
    }
}
