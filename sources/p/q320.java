package p;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.InterruptibleChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q320 implements Closeable, AutoCloseable, ByteChannel, Channel, GatheringByteChannel, InterruptibleChannel, ReadableByteChannel, ScatteringByteChannel, WritableByteChannel {
    public final FileChannel a;
    public final String b;
    public final boolean c;
    public final v520 d;

    public q320(FileChannel fileChannel, hfb hfbVar, String str, boolean z, v520 v520Var) {
        this.a = fileChannel;
        this.b = str;
        this.c = z;
        this.d = v520Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, java.nio.channels.InterruptibleChannel
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr) throws Exception {
        System.currentTimeMillis();
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(this.a.read(byteBufferArr));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                lValueOf.getClass();
                int i = (lValueOf.longValue() > (-1L) ? 1 : (lValueOf.longValue() == (-1L) ? 0 : -1));
            }
            gvg.s();
        }
        if (e != null) {
            throw e;
        }
        lValueOf.getClass();
        return lValueOf.longValue();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws Exception {
        System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.write(byteBuffer));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                numValueOf.getClass();
            }
            gvg.s();
        }
        if (e != null) {
            throw e;
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr) throws Exception {
        System.currentTimeMillis();
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(this.a.write(byteBufferArr));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                lValueOf.getClass();
            }
            gvg.s();
        }
        if (e == null) {
            lValueOf.getClass();
            return lValueOf.longValue();
        }
        throw e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws Exception {
        System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.read(byteBuffer));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                numValueOf.getClass();
                numValueOf.intValue();
            }
            gvg.s();
        }
        if (e == null) {
            numValueOf.getClass();
            return numValueOf.intValue();
        }
        throw e;
    }

    @Override // java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) throws Exception {
        System.currentTimeMillis();
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(this.a.write(byteBufferArr, i, i2));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                lValueOf.getClass();
            }
            gvg.s();
        }
        if (e == null) {
            lValueOf.getClass();
            return lValueOf.longValue();
        }
        throw e;
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) throws Exception {
        System.currentTimeMillis();
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(this.a.read(byteBufferArr, i, i2));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                lValueOf.getClass();
                int i3 = (lValueOf.longValue() > (-1L) ? 1 : (lValueOf.longValue() == (-1L) ? 0 : -1));
            }
            gvg.s();
        }
        if (e == null) {
            lValueOf.getClass();
            return lValueOf.longValue();
        }
        throw e;
    }
}
